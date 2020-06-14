package com.motaharinia.msutility.grid.filter;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-12
 * Time: 01:05:58
 * Description: از این کلاس برای انتقال اطلاعات جستجوی پیشرفته گریدهای بک پنل به سمت سرور استفاده میشود.
 *  تا این لحظه این قابلیت برای گریدهای فرانت به دلیل عدم خریداری نسخه تجاری گرید پیاده سازی نشده است
 */
@JsonRootName(value = "searchoptions")
public class GridSearchOptionsModel implements Serializable {
    
    // نوع جستجو که اند یا ار هست
    //and , or
    @JsonProperty(value = "stype")
    private String searchType;
    //لیستی از اپراتورهای جستجو که میتواند در کامبو جستجوی پیشرفته بیاید
    //مانند : like , equal , bigger , less , ....
    @JsonProperty(value = "sopt")
    private String[] searchOperatorArray; //array of search operations
    //مقداری که کاربر در پنجره جستجوی پیشرفته گریدهای بک پنل برای اپراتور وارد میکند
    @JsonProperty(value = "value")
    private String searchValue; //used when column is combo box
    
    public GridSearchOptionsModel(String searchType, String[] searchOperatorArray){
        this.searchType = searchType;
        this.searchOperatorArray = searchOperatorArray;
    }
    
    public GridSearchOptionsModel(String searchType, String[] searchOperatorArray, String searchValue){
        this.searchType = searchType;
        this.searchOperatorArray = searchOperatorArray;
        this.searchValue = searchValue;
    }

    public GridSearchOptionsModel() {
    }

    //getter-setter:
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String[] getSearchOperatorArray() {
        return searchOperatorArray;
    }

    public void setSearchOperatorArray(String[] searchOperatorArray) {
        this.searchOperatorArray = searchOperatorArray;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

}
