/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.price;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author administrator
 */
public class PriceValidator implements ConstraintValidator<Price, Integer>  {

    @Override
    public void initialize(Price a) {
        
    }

    @Override
    public boolean isValid(Integer price, ConstraintValidatorContext cvc) {
        if(price == null){
            return true;
        }
     
      return (price >= 0);
    }
    
}
