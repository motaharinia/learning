package com.motaharinia.designpattern.javacore.structural.facade;

public interface MobileShop {
    /**
     * شماره مدل گوشی را خروجی میدهد
     *
     * @return خروجی: شماره مدل گوشی
     */
    public String getModelNo();

    /**
     * قیمت گوشی را خروجی میدهد
     *
     * @return خروجی: قیمت گوشی
     */
    public Long getPrice();
}
