/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.organizationnationalcode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class OrganizationNationalCodeValidator implements ConstraintValidator<OrganizationNationalCode, String>  {

    @Override
    public void initialize(OrganizationNationalCode a) {
        
    }

    @Override
    public boolean isValid(String ntionalCode, ConstraintValidatorContext cvc) {
         if(ntionalCode == null || ntionalCode.equals("")){
            return true;
        }
        
        String pattern = "[0-9]{11}";
        return ntionalCode.matches(pattern);
    }
    
}
