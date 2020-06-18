/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.stringpattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class StringPatternValidator implements ConstraintValidator<StringPattern, String> {
    
    private String pattern;

    @Override
    public void initialize(StringPattern a) {
        pattern = a.pattern();
        
    }

    @Override
    public boolean isValid(String string, ConstraintValidatorContext cvc) {
        if(string == null || string.equals("")){
            return true;
        }
        
        return string.matches(pattern);
    }
    
}
