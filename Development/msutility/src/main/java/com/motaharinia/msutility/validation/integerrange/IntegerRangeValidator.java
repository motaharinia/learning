/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.integerrange;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class IntegerRangeValidator implements ConstraintValidator<IntegerRange, Integer> {

    private String message;
    private Integer min;
    private Integer max;

    @Override
    public void initialize(IntegerRange a) {
        min = a.min();
        max = a.max();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext cvc) {
        if (integer == null) {
            return true;
        }

        boolean result = true;

        if (integer < min) {
            result = false;
            message = "validation.range[min=" + min + "]";
        } else if (integer > max) {
            result = false;
            message = "validation.range[max=" + max + "]";
        }

        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;
    }


}
