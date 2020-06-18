/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.nationalcode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Administrator
 */
public class NationalCodeValidator implements ConstraintValidator<NationalCode, String> {

    @Override
    public void initialize(NationalCode constraintAnnotation) {
    }

    @Override
    public boolean isValid(String nationalCode, ConstraintValidatorContext context) {
        return checkNationalCode(nationalCode);
    }

    public static Boolean checkNationalCode(String nationalCode) {
        if (nationalCode == null || nationalCode.equals("")) {
            return true;
        }
        if (!nationalCode.matches("\\d{10}")) {
            return false;
        }
        if (nationalCode.equals("1111111111")
                || nationalCode.equals("2222222222")
                || nationalCode.equals("3333333333")
                || nationalCode.equals("4444444444")
                || nationalCode.equals("5555555555")
                || nationalCode.equals("6666666666")
                || nationalCode.equals("7777777777")
                || nationalCode.equals("8888888888")
                || nationalCode.equals("9999999999")) {
            return false;
        }
        int a = Integer.parseInt("" + nationalCode.charAt(9));

        int b = 0;
        for (int i = 0; i < 9; i++) {
            b += (Integer.parseInt("" + nationalCode.charAt(i)) * (10 - i));
        }
        b = b % 11;
        return (b < 2 && b == a) || (b >= 2 && a == (11 - b));
    }

}
