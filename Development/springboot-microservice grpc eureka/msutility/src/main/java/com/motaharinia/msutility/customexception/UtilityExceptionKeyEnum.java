package com.motaharinia.msutility.customexception;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-11<br>
 * Time: 01:22:13<br>
 * Description:<br>
 *     مقادیر ثابت کلید اکسپشنهای یوتیلیتی که در کلاینت ساید پروژه ترجمه آنها طبق زبان انتخاب شده کاربر نمایش داده خواهد شد
 */
public enum UtilityExceptionKeyEnum implements  CustomExceptionKey{

    /**
     * یکی از ورودی های متد مقدار null و یا خالی دارد
     */
    METHOD_PARAMETER_IS_NULL_OR_EMPTY("METHOD_PARAMETER_IS_NULL_OR_EMPTY"),
    /**
     * فرمت تاریخ رشته ورودی صحیح نمیباشد
     */
    INCORRECT_STRING_DATE_FORMAT("INCORRECT_STRING_DATE_FORMAT"),
    /**
     *  تاریخ معتبر نمیباشد
     */
    DATE_VALIDATION_FAILED("DATE_VALIDATION_FAILED"),
    /**
     *  تاریخ-زمان معتبر نمیباشد
     */
    DATE_TIME_VALIDATION_FAILED("DATE_TIME_VALIDATION_FAILED"),
    /**
     * مقدار انتیتی تهی میباشد
     */
    CHECK_ENTITY_IS_NULL("CHECK_ENTITY_IS_NULL"),
    /**
     *  انتیتی غیرفعال میباشد
     */
    CHECK_ENTITY_IS_INVALID("CHECK_ENTITY_IS_INVALID"),
    /**
     *رفلکشن: فیلد مورد نظر مطابق نام ورودی در کلاس وجود ندارد
     */
    REFLECTION_FIELD_IS_NOT_EXISTED("REFLECTION_FIELD_IS_NOT_EXISTED"),
    /**
     *رفلکشن: متد مورد نظر مطابق نام ورودی در کلاس وجود ندارد
     */
    REFLECTION_METHOD_IS_NOT_EXISTED("REFLECTION_METHOD_IS_NOT_EXISTED"),


    TOKEN_IS_INVALID("TOKEN_IS_INVALID"),
    SMS_SEND_BATCH_FAILED("SMS_SEND_BATCH_FAILED"),
    SMS_SEND_CONNECTION_REFUSED("SMS_SEND_CONNECTION_REFUSED"),
    FSO_PATH_IS_NOT_EXISTED("FSO_PATH_IS_NOT_EXISTED"),
    FSO_PATH_IS_NOT_DIRECTORY("FSO_PATH_IS_NOT_DIRECTORY"),
    DATETIME_VALIDATION_FAILED("DATETIME_VALIDATION_FAILED"),
    ORIGINAL_IMAGE_FILEBYTE_IS_NULL_OR_EMPTY("ORIGINAL_IMAGE_FILEBYTE_IS_NULL_OR_EMPTY"),
    DIRECTORY_REAL_PATH_IS_NULL_OR_EMPTY("DIRECTORY_REAL_PATH_IS_NULL_OR_EMPTY"),
    FILE_FULLNAME_IS_NULL_OR_EMPTY("FILE_FULLNAME_IS_NULL_OR_EMPTY"),
    FILE_EXTENSION_IS_NULL_OR_EMPTY("FILE_EXTENSION_IS_NULL_OR_EMPTY"),
    IMAGE_HEIGHT_IS_NULL_OR_POSITIVE_NUMBER("IMAGE_HEIGHT_IS_NULL_OR_POSITIVE_NUMBER"),
    IMAGE_WIDTH_IS_NULL_OR_POSITIVE_NUMBER("IMAGE_WIDTH_IS_NULL_OR_POSITIVE_NUMBER"),
    ORIGINAL_IMAGE_IS_NULL_OR_INCORRECT("ORIGINAL_IMAGE_IS_NULL_OR_INCORRECT");

    private final String value;

    UtilityExceptionKeyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return super.toString();
    }
}
