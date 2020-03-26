package com.motaharinia.designpattern.javacore.creational.abstractfactory.loan;

public enum LoanEnum {
    BUSINESS("BUSINESS"),
    EDUCATIONAL("EDUCATIONAL"),
    HOME("HOME");

    //مقدار ثابت وام
    private String value;

    /**
     * مقدار ثابت وام را خروجی میدهد
     *
     * @return خروجی: مقدار ثابت وام
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت وام از روی مقدار ثابت آن
     *
     * @param value مقدار ثابت وام
     */
    LoanEnum(String value) {
        this.value = value;
    }
}
