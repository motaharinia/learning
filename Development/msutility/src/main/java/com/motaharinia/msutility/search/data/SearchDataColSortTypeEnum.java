package com.motaharinia.msutility.search.data;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-16
 * Time: 23:14:13
 * Description: اینام مقادیر ثابت نحوه مرتب سازی مطالب
 */
public enum SearchDataColSortTypeEnum {
    /**
     *مرتب سازی متنی
     */
    TEXT("TEXT"),
    /**
     *مرتب سازی عددی
     */
    NUMBER("NUMBER")
    ;

    //نحوه مرتب سازی مطالب
    private String value;

    /**
     * مقدار نحوه مرتب سازی مطالب را خروجی میدهد
     *
     * @return خروجی: مقدارنحوه مرتب سازی مطالب
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت نحوه مرتب سازی مطالب از روی مقدار نحوه مرتب سازی مطالب آن
     *
     * @param value مقدار ثابت نحوه مرتب سازی مطالب
     */
    SearchDataColSortTypeEnum(String value) {
        this.value = value;
    }

}
