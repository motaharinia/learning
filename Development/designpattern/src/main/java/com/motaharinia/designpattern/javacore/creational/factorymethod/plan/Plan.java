package com.motaharinia.designpattern.javacore.creational.factorymethod.plan;

public abstract class Plan {
    //نرخ محاسبه برق بر اساس طرح مصرف برق
    protected Double rate;

    /**
     * این متد نرخ محاسبه برق بر اساس طرح مصرف برق را ست میکند
     */
    protected abstract Double setRate();

    /**
     * این متد مبلغ قبض برق را محاسبه مینماید
     *
     * @param units میزان واحد مصرف برق ماهیانه
     * @return خروجی: مبلغ قبض قابل پرداخت
     */
    public double calculateBill(Integer units) {
        return units * this.setRate();
    }
}
