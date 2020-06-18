package com.motaharinia.msutility.customexception;

import org.jetbrains.annotations.NotNull;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-11<br>
 * Time: 02:33:39<br>
 * Description:<br>
 *     کلاس اکسپشنهای یوتیلیتی که توسط برنامه نویس در پکیج یوتیلیتی کنترل شده است
 */
public class UtilityException extends CustomException {
    public UtilityException(@NotNull Class exceptionOccurredClass,@NotNull CustomExceptionKey customExceptionKey, String exceptionDescription) {
        super(CustomExceptionTypeEnum.UTILITY_EXCEPTION,exceptionOccurredClass,customExceptionKey,exceptionDescription);
    }
}
