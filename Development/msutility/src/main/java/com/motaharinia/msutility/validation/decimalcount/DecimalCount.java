/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.decimalcount;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */

@Documented
@Constraint(validatedBy = DecimalCountValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DecimalCount {
    
    String message() default "validation.decimalCount";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
    
    int min() default 0;
    
    int max() default 0;
    
    int exact() default 0;
    
}
