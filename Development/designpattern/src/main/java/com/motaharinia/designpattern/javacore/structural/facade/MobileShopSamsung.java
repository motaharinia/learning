package com.motaharinia.designpattern.javacore.structural.facade;

public class MobileShopSamsung implements MobileShop {
    /**
     * شماره مدل گوشی را خروجی میدهد
     *
     * @return خروجی: شماره مدل گوشی
     */
    @Override
    public String getModelNo() {
        return "Samsung galaxy tab 3";
    }

    /**
     * قیمت گوشی را خروجی میدهد
     *
     * @return خروجی: قیمت گوشی
     */
    @Override
    public Long getPrice() {
        return 45000L;
    }
}
