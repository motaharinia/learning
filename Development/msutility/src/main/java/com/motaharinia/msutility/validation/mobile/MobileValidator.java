/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.mobile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class MobileValidator implements ConstraintValidator<Mobile, String>  {

    @Override
    public void initialize(Mobile a) {
        
    }

    @Override
    public boolean isValid(String mobile, ConstraintValidatorContext cvc) {
        if(mobile == null || mobile.equals("")){
            return true;
        }
        
        String pattern = "^(09|\\+989)[0-9]{9}$";
        return mobile.matches(pattern);
    }
    
    
}
