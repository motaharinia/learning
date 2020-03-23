package com.motaharinia.designpattern.behavioral.strategy;

public class StrategyAddition implements Strategy {
    /**
     * این متد طبق استراتژی که تعیین شده است دو عدد را با هم جمع یا منها یا ضرب میکند
     *
     * @param a عدد اول
     * @param b عدد دوم
     * @return خروجی: نتیجه محاسبه
     */
    @Override
    public Float calculation(Float a, Float b) {
        return a+b;
    }
}
