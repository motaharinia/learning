package com.motaharinia.msutility.search.annotation;

import com.motaharinia.msutility.search.data.SearchDataColAlignEnum;
import com.motaharinia.msutility.search.data.SearchDataColSearchTypeEnum;
import com.motaharinia.msutility.search.data.SearchDataColSortTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 18:28:02
 * Description: از این انوتیشن برای تنظیم کردن مشخصات نمایشی ستونهای خروجی داده استفاده میشود
 * فیلد ایندکس و نام ضروری هستند
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SearchDataColumn {
    //نام فیلد ستون
    public String name();
    //اندیس و ترتیب قرارگیری ستون
    public int index();
    //جهت نمایش افقی
    public SearchDataColAlignEnum align() default SearchDataColAlignEnum.CENTER;
    //عرض ستون
    public int width() default 100;
    //نوع مرتب سازی ستون که عددی یا متنی است
    public SearchDataColSortTypeEnum sortType() default SearchDataColSortTypeEnum.TEXT;
    //نوع جستجوی ستون
    public SearchDataColSearchTypeEnum searchType() default SearchDataColSearchTypeEnum.TEXT ;
    //فرمت کننده ستون
    //مثلا میخواهیم برای مقادیر صفر در ستون کلمه خیر بیاریم و برای مقادیر یک در ستون کلمه بلی بیاریم
    public String formatter() default "";
    //جستجوی پیشرفته دارد یا خیر
    public boolean searchable() default true;
    //ستون قابل مرتب سازی داده هست یا خیر
    public boolean sortable() default true;
}
