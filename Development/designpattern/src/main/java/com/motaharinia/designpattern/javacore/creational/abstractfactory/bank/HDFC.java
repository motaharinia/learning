package com.motaharinia.designpattern.javacore.creational.abstractfactory.bank;

public class HDFC implements Bank {
    //نام بانک
    private final String BNAME;

    /**
     * تابع سازنده بانک که در زمان ایجاد نام بانک را نیز در داخل شیی از طریق مقدار ثابت آن پر میکند
     */
    public HDFC() {
        BNAME = BankEnum.HDFC.getValue();
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
