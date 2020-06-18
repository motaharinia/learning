/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.validation.doublerange;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */
@Documented
@Constraint(validatedBy = DoubleRangeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DoubleRange {

    String message() default "validation.range";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    double min() default 4.9E-324;

    double max() default 1.7976931348623157E308;

}
