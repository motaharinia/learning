/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.stringlength;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class StringLengthValidator implements ConstraintValidator<StringLength, String> {

    private String message;
    private Integer min;
    private Integer max;
    private Integer exact;

    @Override
    public void initialize(StringLength a) {
        min = a.min();
        max = a.max();
        exact = a.exact();
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext cvc) {
        if(str == null || str.equals("")){
            return true;
        }
        boolean result = true;
        if(exact > 0 && str.length() != exact){
            result = false;
            message = "validation.stringLength[exact=" + exact + "]";
        }
        
        else if (min <= 0 && max <= 0) {
            result = false;  
        }
        
        else if(min > 0 && max > 0 && min > max){
            result = false;
        }
        
        else if(min > 0 && str.length() < min){
            result = false;
            message = "validation.stringLength[min=" + min + "]";
        }
        else if(max > 0 && str.length() > max){
            result = false;
            message = "validation.stringLength[max=" + max + "]";
        }
        
        
        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;
    }
    
 

}
