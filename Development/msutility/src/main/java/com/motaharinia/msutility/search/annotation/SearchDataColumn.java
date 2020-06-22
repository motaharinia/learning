package com.motaharinia.msutility.search.annotation;

import com.motaharinia.msutility.search.data.SearchDataColAlignEnum;
import com.motaharinia.msutility.search.data.SearchDataColSearchTypeEnum;
import com.motaharinia.msutility.search.data.SearchDataColSortTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-17<br>
 * Time: 18:28:02<br>
 * Description:<br>
 * از این انوتیشن برای تنظیم کردن مشخصات نمایشی ستونهای خروجی داده استفاده میشود<br>
 * فیلد ایندکس و نام ضروری هستند
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SearchDataColumn {
    /**
     * نام فیلد ستون
     */
    String name();

    /**
     * اندیس و ترتیب قرارگیری ستون
     */
    int index();

    /**
     * جهت نمایش افقی
     */
    SearchDataColAlignEnum align() default SearchDataColAlignEnum.CENTER;

    /**
     * عرض ستون
     */
    int width() default 100;

    /**
     * نوع مرتب سازی ستون که عددی یا متنی است
     */
    SearchDataColSortTypeEnum sortType() default SearchDataColSortTypeEnum.TEXT;

    /**
     * نوع جستجوی ستون که متنی یا انتخابی است
     */
    SearchDataColSearchTypeEnum searchType() default SearchDataColSearchTypeEnum.TEXT;

    /**
     * رشته فرمت کننده ستون
     * مثلا میخواهیم برای مقادیر صفر در ستون کلمه خیر بیاریم و برای مقادیر یک در ستون کلمه بلی بیاریم
     */
    String formatter() default "";

    /**
     * جستجوی پیشرفته دارد یا خیر
     */
    boolean searchable() default true;

    /**
     * قابل مرتب سازی داده هست یا خیر
     */
    boolean sortable() default true;
}
