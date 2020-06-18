package com.motaharinia.msutility.validation.companyphone;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 *
 * @author administrator
 */
@Documented
@Constraint(validatedBy = CompanyPhoneValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CompanyPhone {
    
    String message() default "validation.companyPhone";
      
    Class<?>[] groups() default {};
      
    Class<? extends Payload>[] payload() default {};
    
}
