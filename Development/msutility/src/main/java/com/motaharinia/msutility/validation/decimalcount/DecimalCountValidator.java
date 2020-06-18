/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.decimalcount;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
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
        
        if(number == null){
            return true;
        }
        boolean result = true;
        String doubleStr = number + "";
        String parts[] = doubleStr.split("\\.");
        String decimalPart = parts[1];
        
        
        if(exact > 0 && decimalPart.length() != exact){
            result = false;
            message = "validation.decimalCount[exact=" + exact + "]";
        }
        
        else if (min <= 0 && max <= 0) {
            result = false;  
        }
        
        else if(min > 0 && max > 0 && min > max){
            result = false;
        }
        
        else if(min > 0 && decimalPart.length() < min){
            result = false;
            message = "validation.decimalCount[min=" + min + "]";
        }
        else if(max > 0 && decimalPart.length() > max){
            result = false;
            message = "validation.decimalCount[max=" + max + "]";
        }
        
        
        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;

    }
    

}
