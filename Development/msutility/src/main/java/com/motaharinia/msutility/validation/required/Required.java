/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.required;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */

@Documented
@Constraint(validatedBy = RequiredValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Required {
    
    String message() default "validation.required";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
    
}
