/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.postalcode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {

    @Override
    public void initialize(PostalCode a) {
        
    }

    @Override
    public boolean isValid(String postalCode, ConstraintValidatorContext cvc) {
        if(postalCode == null || postalCode.equals("")){
            return true;
        }
        
        String pattern = "[0-9]{10}";
        return postalCode.matches(pattern);
    }
    
}
