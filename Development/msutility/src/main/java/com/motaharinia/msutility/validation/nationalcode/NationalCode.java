/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.nationalcode;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author Administrator
 */
@Documented
@Constraint(validatedBy = NationalCodeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NationalCode {
    
      
    String message() default "validation.nationalCode";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
    
}
