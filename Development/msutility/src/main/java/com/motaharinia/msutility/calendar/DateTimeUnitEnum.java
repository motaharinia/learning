/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.motaharinia.msutility.calendar;


/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-11
 * Time: 01:22:13
 * Description: مقادیر ثابت واحدهای زمانی
 */
public enum DateTimeUnitEnum {

    /**
     * واحد زمانی سال
     */
    YEAR("YEAR"),
    /**
     * واحد زمانی ماه
     */
    MONTH("MONTH"),
    /**
     * واحد زمانی روز
     */
    DAY("DAY"),
    /**
     * واحد زمانی ساعت
     */
    HOUR("HOUR"),
    /**
     * واحد زمانی دقیقه
     */
    MINUTE("MINUTE"),
    /**
     * واحد زمانی ثانیه
     */
    SECOND("SECOND"),
    /**
     * واحد زمانی میلی ثانیه
     */
    MILLISECOND("MILLISECOND"),
    ;
    private final String value;

    private DateTimeUnitEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return super.toString();
    }
}
