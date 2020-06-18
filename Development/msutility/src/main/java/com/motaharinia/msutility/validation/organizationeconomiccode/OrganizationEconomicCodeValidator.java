/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.organizationeconomiccode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class OrganizationEconomicCodeValidator implements ConstraintValidator<OrganizationEconomicCode, String>  {

    @Override
    public void initialize(OrganizationEconomicCode a) {
        
    }

    @Override
    public boolean isValid(String economicCode, ConstraintValidatorContext cvc) {
        if(economicCode == null || economicCode.equals("")){
            return true;
        }
        
        String pattern = "[0-9]{14}";
        return economicCode.matches(pattern);
    }
    
}
