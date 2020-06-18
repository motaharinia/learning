package com.motaharinia.msutility.customexception;

import org.jetbrains.annotations.NotNull;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *     کلاس لیست اکسپشنهای بیزینسی که در یک تراکنش بیش از یک اکسپشن وجود داشته است و توسط برنامه نویس در پکیج بیزینس کنترل شده است
 */
public class ListException extends CustomException {
    public ListException(@NotNull Class exceptionOccurredClass,@NotNull CustomExceptionKey customExceptionKey, String exceptionDescription) {
        super(CustomExceptionTypeEnum.LIST_EXCEPTION, exceptionOccurredClass, customExceptionKey, exceptionDescription);
    }
}
