package com.motaharinia.msutility.base.presentation.model.griddata;

public enum GridFilterSortTypeEnum {
    ASC("ASC"),
    DSC("DSC");

    //نوع مرتب سازی
    private String value;

    /**
     * مقدار نوع مرتب سازی را خروجی میدهد
     *
     * @return خروجی: مقدار نوع مرتب سازی
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت نوع مرتب سازی از روی مقدار نوع مرتب سازی آن
     *
     * @param value مقدار  ثابت نوع مرتب سازی
     */
    GridFilterSortTypeEnum(String value) {
        this.value = value;
    }

}


