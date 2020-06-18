/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.listlength;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 *
 * @author administrator
 */
public class ListLengthValidator implements ConstraintValidator<ListLength, List> {

    private String message;
    private Integer min;
    private Integer max;
    private Integer exact;

    @Override
    public void initialize(ListLength a) {
        min = a.min();
        max = a.max();
        exact = a.exact();
    }

    @Override
    public boolean isValid(List list, ConstraintValidatorContext cvc) {
        if(list == null || list.isEmpty()){
            return true;
        }
        boolean result = true;
        if(exact > 0 && list.size() != exact){
            result = false;
            message = "validation.listLength[exact=" + exact + "]";
        }
        
        else if (min <= 0 && max <= 0) {
            result = false;  
        }
        
        else if(min > 0 && max > 0 && min > max){
            result = false;
        }
        
        else if(min > 0 && list.size() < min){
            result = false;
            message = "validation.listLength[min=" + min + "]";
        }
        else if(max > 0 && list.size() > max){
            result = false;
            message = "validation.listLength[max=" + max + "]";
        }
        
        
        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;
    }

}
