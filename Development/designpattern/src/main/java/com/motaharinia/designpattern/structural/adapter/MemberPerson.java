package com.motaharinia.designpattern.structural.adapter;

public interface MemberPerson {
    /**
     * نام کاربر حقیقی را خروجی میدهد
     * @return خروجی: نام کاربر حقیقی
     */
    public String getName();

    /**
     * نام خانوادگی کاربر حقیقی را خروجی میدهد
     * @return خروجی: نام خانوادگی کاربر حقیقی
     */
    public String getFamily();
}
