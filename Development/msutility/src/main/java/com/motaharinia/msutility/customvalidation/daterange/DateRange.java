package com.motaharinia.msutility.customvalidation.daterange;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-18<br>
 * Time: 15:02:58<br>
 * Description:<br>
 * انوتیشن اعتبارسنجی محدوده تاریخ<br>
 * فقط برای فیلدهای از نوع CustomDate میتوان از این اعتبارسنجی استفاده کرد
 */
@Documented
@Constraint(validatedBy = DateRangeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateRange {
    
    String message() default "customValidation.dateRange";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * ابتدای محدوده زمانی که غیر از تاریخ میتواند به صورت unlimited به معنی بی نهایت و یا به صورت today به معنی امروز نیز پر شود
     * @return خروجی: ابتدای محدوده زمانی
     */
    String from() default  "unlimited";

    /**
     * انتهای محدوده زمانی که غیر از تاریخ میتواند به صورت unlimited به معنی بی نهایت و یا به صورت today به معنی امروز نیز پر شود
     * @return خروجی: انتهای محدوده زمانی
     */
    String to() default "unlimited";
    
}
