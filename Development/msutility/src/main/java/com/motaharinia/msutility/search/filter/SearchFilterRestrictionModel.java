package com.motaharinia.msutility.search.filter;

import java.io.Serializable;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-16<br>
 * Time: 23:05:15<br>
 * Description:<br>
 *     این کلاس مدل شرطی است که میخواهیم در جستجو هایی مانند جستجوی گرید از آن استفاده کنیم
 */
public class SearchFilterRestrictionModel implements Serializable {

    //فیلدی که روی آن شرط گذاشته میشود
    private String fieldName;
    //عملیات مورد نظر
    private SearchFilterOperationEnum fieldOperation;
    //مقدار شرط فیلد مورد نظر
    private Object fieldValue;


    public SearchFilterRestrictionModel() {
    }

    public SearchFilterRestrictionModel(String fieldName, SearchFilterOperationEnum fieldOperation, Object fieldValue) {
        this.fieldName = fieldName;
        this.fieldOperation = fieldOperation;
        this.fieldValue = fieldValue;
    }

    @Override
    public String toString() {
        return "SearchFilterRestrictionModel{" +
                "fieldName='" + fieldName + '\'' +
                ", fieldOperation=" + fieldOperation +
                ", fieldValue=" + fieldValue +
                '}';
    }

    //getter-setter:
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    public SearchFilterOperationEnum getFieldOperation() {
        return fieldOperation;
    }

    public void setFieldOperation(SearchFilterOperationEnum fieldOperation) {
        this.fieldOperation = fieldOperation;
    }

}
