/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.stringlength;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */

/*
This annotation is for validating String length. Validation for length has 3 state:
    1. String has a minimum lenght
    2. String has a maximum length
    3. String has minimum and maximum lengh
*/

@Documented
@Constraint(validatedBy = StringLengthValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface StringLength {
    
    String message() default "validation.stringLength";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
    
    int min() default 0;
    
    int max() default 0;
    
    int exact() default 0;
    
}
