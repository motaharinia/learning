package com.motaharinia.msutility.customvalidation.decimalcount;

import org.springframework.util.ObjectUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:02:58<br>
 * Description:<br>
 *     کلاس بررسی کننده انوتیشن اعتبارسنجی محدوده و تعداد دقیق تعداد رقم اعشار<br>
 * فقط برای فیلدهای از نوع Double میتوان از این اعتبارسنجی استفاده کرد
 */
public class DecimalCountValidator implements ConstraintValidator<DecimalCount, Double> {

    private String message;
    private Integer min;
    private Integer max;
    private Integer exact;

    @Override
    public void initialize(DecimalCount a) {
        min = a.min();
        max = a.max();
        exact = a.exact();
    }

    @Override
    public boolean isValid(Double number, ConstraintValidatorContext cvc) {
        if(ObjectUtils.isEmpty(number)){
            return true;
        }
        boolean result = true;
        String doubleStr = number + "";
        String parts[] = doubleStr.split("\\.");
        String decimalPart = parts[1];
        
        
        if(exact > 0 && decimalPart.length() != exact){
            result = false;
            message = "customValidation.decimalCount[exact=" + exact + "]";
        }
        
        else if (min <= 0 && max <= 0) {
            result = false;  
        }
        
        else if(min > 0 && max > 0 && min > max){
            result = false;
        }
        
        else if(min > 0 && decimalPart.length() < min){
            result = false;
            message = "customValidation.decimalCount[min=" + min + "]";
        }
        else if(max > 0 && decimalPart.length() > max){
            result = false;
            message = "customValidation.decimalCount[max=" + max + "]";
        }
        
        
        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;

    }
    

}
