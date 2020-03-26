package com.motaharinia.designpattern.javacore.structural.facade;

public class MobileShopBlackberry implements MobileShop {
    /**
     * شماره مدل گوشی را خروجی میدهد
     *
     * @return خروجی: شماره مدل گوشی
     */
    @Override
    public String getModelNo() {
        return "Blackberry Z10";
    }

    /**
     * قیمت گوشی را خروجی میدهد
     *
     * @return خروجی: قیمت گوشی
     */
    @Override
    public Long getPrice() {
        return 55000L;
    }
}
