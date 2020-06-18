/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.organizationregistrationno;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class OrganizationRegistrationNoValidator implements ConstraintValidator<OrganizationRegistrationNo, String> {

    @Override
    public void initialize(OrganizationRegistrationNo a) {
        
    }

    @Override
    public boolean isValid(String registrationNo, ConstraintValidatorContext cvc) {
        if(registrationNo == null || registrationNo.equals("")){
            return true;
        }
        
        String pattern = "[0-9]+";
        return registrationNo.matches(pattern);
    }
    
}
