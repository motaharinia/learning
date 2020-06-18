package com.motaharinia.msutility.customexception;

import org.jetbrains.annotations.NotNull;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *     کلاس اکسپشنهای بیزینسی که توسط برنامه نویس در پکیج بیزینس کنترل شده است
 */
public class BusinessException extends CustomException {
    public BusinessException(@NotNull Class exceptionOccurredClass,@NotNull CustomExceptionKey customExceptionKey, String exceptionDescription) {
        super(CustomExceptionTypeEnum.BUSINESS_EXCEPTION, exceptionOccurredClass, customExceptionKey, exceptionDescription);
    }
}
