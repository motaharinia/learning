package com.motaharinia.msutility.search.filter;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-16
 * Time: 23:14:13
 * Description: این مدل یک دستور مرتب سازی را تشریح میکند که چه فیلدی چه نوع مرتب سازی داشته باشد
 */
public class SearchFilterSortModel implements Serializable {
    /**
     * نام فیلدی که میخواهیم روی آن ترتیب اعمال شود
     */
    private String fieldName;
    /**
     * نوع مرتب سازی نزولی و یا صعودی فیلد مورد نظر
     */
    private SearchFilterSortTypeEnum type;

    public SearchFilterSortModel() {
    }

    public SearchFilterSortModel(String fieldName, SearchFilterSortTypeEnum type) {
        this.fieldName = fieldName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "SearchFilterSortModel{" +
                "fieldName='" + fieldName + '\'' +
                ", type=" + type +
                '}';
    }

    //getter-setter
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public SearchFilterSortTypeEnum getType() {
        return type;
    }

    public void setType(SearchFilterSortTypeEnum type) {
        this.type = type;
    }
}
