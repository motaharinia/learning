/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.persiancharacters;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class PersianCharactersValidator implements ConstraintValidator<PersianCharacters, String> {

    @Override
    public void initialize(PersianCharacters a) {
    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext cvc) {
        if (str == null || str.equals("")) {
            return true;
        }

        //Use only persian characters and space
        String pattern = "^[(\\u0600-\\u06FF)|(\\u0020)]+$";
        return str.matches(pattern);

    }

}
