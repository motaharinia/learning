/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

/**
 *
 * @author administrator
 */
public class PasswordValidator implements ConstraintValidator<Password, String> {

    private String message;
    private Integer minLength;
    private Boolean complicated;

    @Override
    public void initialize(Password a) {
        minLength = a.minLength();
        complicated = a.complicated();
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext cvc) {
        if (password == null || password.equals("")) {
            return true;
        }

        if (minLength <= 0) {
            return false;
        }

        boolean result = true;
        if (password.length() < minLength) {
            message = "validation.password[minLength=" + minLength + "]";
            cvc.disableDefaultConstraintViolation();
            cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
            return false;
        }

        if (complicated == true) {
            if (!validateComplicatedPassword(password)) {
                message = "validation.password[complicated=true]";
                cvc.disableDefaultConstraintViolation();
                cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
                result = false;
            }
        }

        return result;

    }

    private static boolean validateComplicatedPassword(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        char[] passwordLetters = password.toCharArray();
        return hasUppercase && hasLowercase && hasPunctuation(passwordLetters) && hasDigit(passwordLetters);

    }

    private static boolean hasPunctuation(char[] passwordLetters) {
        boolean result = false;
        String[] punctuations = new String[]{"!", "?", "'", ".", "(", ")", "-", ":", ";", ",", "\"", "%", "@", "$", "^", "&", "*", "+", "="};
        for (int i = 0; i < passwordLetters.length; i++) {
            if (Arrays.asList(punctuations).contains(passwordLetters[i] + "")) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static boolean hasDigit(char[] passwordLetters) {
        boolean result = false;
        String[] numbers = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < passwordLetters.length; i++) {
            if (Arrays.asList(numbers).contains(passwordLetters[i] + "")) {
                result = true;
                break;
            }
        }
        return result;
    }

}
