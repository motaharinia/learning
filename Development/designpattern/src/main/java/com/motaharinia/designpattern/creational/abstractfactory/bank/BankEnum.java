package com.motaharinia.designpattern.creational.abstractfactory.bank;

public enum BankEnum {
    HDFC("HDFC BANK"),
    ICICI("ICICI BANK"),
    SBI("SBI BANK");

    //مقدار ثابت بانک
    private String value;

    /**
     * مقدار ثابت بانک را خروجی میدهد
     *
     * @return خروجی: مقدار ثابت بانک
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت بانک از روی مقدار ثابت آن
     *
     * @param value مقدار ثابت بانک
     */
    BankEnum(String value) {
        this.value = value;
    }
}
