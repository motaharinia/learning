package com.motaharinia.designpattern.creational.abstractfactory.bank;

public class SBI implements Bank {
    //نام بانک
    private final String BNAME;

    /**
     * تابع سازنده بانک که در زمان ایجاد نام بانک را نیز در داخل شیی از طریق مقدار ثابت آن پر میکند
     */
    public SBI() {
        BNAME = BankEnum.SBI.getValue();
    }

    /**
     * تابعی که نام بانک را خروجی میدهد
     *
     * @return خروجی: نام بانک
     */
    public String getBankName() {
        return BNAME;
    }
}
