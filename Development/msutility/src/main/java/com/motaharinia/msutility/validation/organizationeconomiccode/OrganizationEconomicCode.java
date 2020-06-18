/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.motaharinia.msutility.validation.organizationeconomiccode;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */

@Documented
@Constraint(validatedBy = OrganizationEconomicCodeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface OrganizationEconomicCode {
    String message() default "validation.organizationEconomicCode";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
}
