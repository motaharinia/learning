package com.motaharinia.msutility.customexception;


/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-11
 * Time: 01:22:13
 * Description: مقادیر ثابت نوع اکسپشن
 */
public enum CustomExceptionTypeEnum {

    /**
     * این نوع اکسپشن در پکیج یوتیلیتی استفاده میشود و توسط برنامه نویس کنترل شده است
     */
    UTILITY_EXCEPTION("UTILITY_EXCEPTION"),
    /**
     * این نوع اکسپشن در پکیج سرویس در دامین بیزینسی اتفاق می افتد و توسط برنامه نویس کنترل شده است
     */
    BUSINESS_EXCEPTION("BUSINESS_EXCEPTION"),
    /**
     * این نوع اکسپشن در پکیج سرویس در دامین بیزینسی اتفاق می افتد به صورتی که در یک تراکنش بیش از یک خطا وجود داشته و توسط برنامه نویس کنترل شده است
     */
    LIST_EXCEPTION("LIST_EXCEPTION");
    private final String value;

    private CustomExceptionTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return super.toString();
    }
}
