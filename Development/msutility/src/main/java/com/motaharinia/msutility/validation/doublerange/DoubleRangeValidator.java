/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.doublerange;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class DoubleRangeValidator implements ConstraintValidator<DoubleRange, Double> {

    private String message;
    private Double min;
    private Double max;

    @Override
    public void initialize(DoubleRange a) {
        min = a.min();
        max = a.max();
    }

    @Override
    public boolean isValid(Double number, ConstraintValidatorContext cvc) {
        if (number == null) {
            return true;
        }

        boolean result = true;
        if (number < min) {
            result = false;
            message = "validation.range[min=" + min + "]";
        } else if (number > max) {
            result = false;
            message = "validation.range[max=" + max + "]";
        }

        cvc.disableDefaultConstraintViolation();
        cvc.buildConstraintViolationWithTemplate(message).addConstraintViolation();
        return result;
    }

}
