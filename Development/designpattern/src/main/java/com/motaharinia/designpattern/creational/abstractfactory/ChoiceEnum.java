package com.motaharinia.designpattern.creational.abstractfactory;

public enum ChoiceEnum {
    BANK("BANK"),
    LOAN("LOAN");

    //مقدار ثابت انتخاب کاربر
    private String value;

    /**
     * مقدار ثابت انتخاب کاربر را خروجی میدهد
     *
     * @return خروجی: مقدار ثابت انتخاب کاربر
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت انتخاب کاربر از روی مقدار ثابت آن
     *
     * @param value مقدار ثابت انتخاب کاربر
     */
    ChoiceEnum(String value) {
        this.value = value;
    }
}
