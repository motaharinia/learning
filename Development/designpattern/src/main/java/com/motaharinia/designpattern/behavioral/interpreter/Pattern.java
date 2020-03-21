package com.motaharinia.designpattern.behavioral.interpreter;

public interface Pattern {
    /**
     * متد تبدیل
     *
     * @param exp عبارت
     * @return خروجی: عبارت تبدیل شده
     */
    public String conversion(String exp);
}
