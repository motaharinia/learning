/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.companyphone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class CompanyPhoneValidator implements ConstraintValidator<CompanyPhone, String> {

    @Override
    public void initialize(CompanyPhone a) {

    }

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext cvc) {
        if (phone == null || phone.equals("")) {
            return true;
        }

        String pattern = "[0-9]{4,8}";
        return phone.matches(pattern);
    }

}
