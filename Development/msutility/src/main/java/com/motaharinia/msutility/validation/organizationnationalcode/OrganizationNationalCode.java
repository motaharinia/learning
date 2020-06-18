/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.organizationnationalcode;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */
@Documented
@Constraint(validatedBy = OrganizationNationalCodeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface OrganizationNationalCode {
    String message() default "validation.organizationNationalCode";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
}
