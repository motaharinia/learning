/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.latincharacters;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class LatinCharactersValidator implements ConstraintValidator<LatinCharacters, String> {

    @Override
    public void initialize(LatinCharacters a) {

    }

    @Override
    public boolean isValid(String str, ConstraintValidatorContext cvc) {
        if (str == null || str.equals("")) {
            return true;
        }
        
        //Use only latin characters and space
        String pattern = "^[(a-z)|(A-Z)(\\u0020)]+$";
        return str.matches(pattern);
    }

}
