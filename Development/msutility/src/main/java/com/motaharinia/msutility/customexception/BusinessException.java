package com.motaharinia.msutility.customexception;

import org.jetbrains.annotations.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: کلاس اکسپشنهای بیزینسی که توسط برنامه نویس در پکیج بیزینس کنترل شده است
 */
public class BusinessException extends CustomException {
    public BusinessException(@NotNull Class exceptionOccurredClass,@NotNull CustomExceptionKey customExceptionKey, String exceptionDescription) {
        super(CustomExceptionTypeEnum.BUSINESS_EXCEPTION, exceptionOccurredClass, customExceptionKey, exceptionDescription);
    }
}
