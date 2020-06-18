package com.motaharinia.msutility.customexception;

import org.jetbrains.annotations.NotNull;


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-11<br>
 * Time: 02:31:29<br>
 * Description:<br>
 * کلاس اکسپشن پدر پروژه که در دیتابیس لاگ میشود و انواع دیگر اکسپشنها از آن گسترش میابند
 */
public class CustomException extends RuntimeException {

    /**
     * Exception Type
     */
    @NotNull
    private CustomExceptionTypeEnum exceptionType;
    /**
     * The class which exception occurred in. exception message consists of this class info
     */
    @NotNull
    private Class exceptionOccurredClass;
    /**
     * this field improves exception information. and can be used to send additional data to client.
     */
    @NotNull
    private String exceptionMessage;
    /**
     * this field improves exception information. and can be used to send additional data to client.
     */
    private String exceptionDescription;


    public CustomException(@NotNull CustomExceptionTypeEnum exceptionType, @NotNull Class exceptionOccurredClass, @NotNull CustomExceptionKey customExceptionKey, String exceptionDescription) {
        this.exceptionType = exceptionType;
        this.exceptionOccurredClass = exceptionOccurredClass;
        this.exceptionMessage = exceptionType.getValue() + "." + exceptionOccurredClass.getSimpleName() + "." + customExceptionKey.getValue();
        this.exceptionDescription = exceptionDescription;
    }


    //getter-setter:

    @NotNull
    public CustomExceptionTypeEnum getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(@NotNull CustomExceptionTypeEnum exceptionType) {
        this.exceptionType = exceptionType;
    }

    @NotNull
    public Class getExceptionOccurredClass() {
        return exceptionOccurredClass;
    }

    public void setExceptionOccurredClass(@NotNull Class exceptionOccurredClass) {
        this.exceptionOccurredClass = exceptionOccurredClass;
    }

    @NotNull
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(@NotNull String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionDescription() {
        return exceptionDescription;
    }

    public void setExceptionDescription(String exceptionDescription) {
        this.exceptionDescription = exceptionDescription;
    }
}
