package com.motaharinia.msutility.customexception;

import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-11
 * Time: 02:33:39
 * Description: کلاس اکسپشنهای یوتیلیتی که توسط برنامه نویس در پکیج یوتیلیتی کنترل شده است
 */
public class UtilityException extends CustomException {
    public UtilityException(@NotNull Class exceptionOccurredClass,@NotNull CustomExceptionKey customExceptionKey, String exceptionDescription) {
        super(CustomExceptionTypeEnum.UTILITY_EXCEPTION,exceptionOccurredClass,customExceptionKey,exceptionDescription);
    }
}
