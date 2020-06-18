/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.listnoduplicate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author administrator
 */
public class ListNoDuplicateValidator implements ConstraintValidator<ListNoDuplicate, List> {

    @Override
    public void initialize(ListNoDuplicate a) {
    }

    @Override
    public boolean isValid(List list, ConstraintValidatorContext cvc) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        boolean result = true;
        Set set = new HashSet(list);
        if (set.size() < list.size()) {
            result = false;
        }

        return result;
    }

}
