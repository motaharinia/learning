package com.motaharinia.msutility.annotation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.motaharinia.msutility.search.data.SearchDataColAlignEnum;
import com.motaharinia.msutility.search.data.SearchDataColModel;
import com.motaharinia.msutility.search.data.SearchDataColSearchTypeEnum;
import com.motaharinia.msutility.search.data.SearchDataColSortTypeEnum;
import com.motaharinia.msutility.search.filter.SearchFilterOperationEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-17
 * Time: 18:28:02
 * Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SpringDataColumn {
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
