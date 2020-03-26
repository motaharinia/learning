package com.motaharinia.designpattern.javacore.behavioral.strategy;

public class Context {
    //استراتژی محاسبه
    private Strategy strategy;

    /**
     * متد سازنده با تعیین ورودی استراتژی محاسبه
     *
     * @param strategy استراتژی محاسبه
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * این متد مطابق استراتژی محاسبات دو عدد را اجرایی میکند
     *
     * @param num1 عدد اول
     * @param num2 عدد دوم
     * @return خروجی: عدد محاسبه شده
     */
    public Float executeStrategy(Float num1, Float num2) {
        return strategy.calculation(num1, num2);
    }
}
