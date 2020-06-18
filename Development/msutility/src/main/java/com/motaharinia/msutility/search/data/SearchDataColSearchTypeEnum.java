package com.motaharinia.msutility.search.data;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-16
 * Time: 23:14:13
 * Description: اینام مقادیر ثابت نوع جستجو مطالب
 */
public enum SearchDataColSearchTypeEnum {
    /**
     *متنی
     */
    TEXT("TEXT"),
    /**
     *انتخابی
     */
    SELECT("SELECT")
    ;

    //نوع جستجو مطالب
    private String value;

    /**
     * مقدار نوع جستجو مطالب را خروجی میدهد
     *
     * @return خروجی: مقدارنوع جستجو مطالب
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت نوع جستجو مطالب از روی مقدار نوع جستجو مطالب آن
     *
     * @param value مقدار ثابت نوع جستجو مطالب
     */
    SearchDataColSearchTypeEnum(String value) {
        this.value = value;
    }

}
