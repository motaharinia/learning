package com.motaharinia.designpattern.structural.facade;

public class MobileShopIphone implements MobileShop {
    /**
     * شماره مدل گوشی را خروجی میدهد
     *
     * @return خروجی: شماره مدل گوشی
     */
    @Override
    public String getModelNo() {
        return "Iphone 6";
    }

    /**
     * قیمت گوشی را خروجی میدهد
     *
     * @return خروجی: قیمت گوشی
     */
    @Override
    public Long getPrice() {
        return 65000L;
    }
}
