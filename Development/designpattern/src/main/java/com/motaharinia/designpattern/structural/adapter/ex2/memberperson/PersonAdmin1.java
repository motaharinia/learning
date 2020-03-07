package com.motaharinia.designpattern.structural.adapter.ex2.memberperson;

import com.motaharinia.designpattern.structural.adapter.ex2.MemberPerson;

public class PersonAdmin1 implements MemberPerson {
    /**
     * نام کاربر حقیقی را خروجی میدهد
     *
     * @return خروجی: نام کاربر حقیقی
     */
    @Override
    public String getName() {
        return "Bill";
    }

    /**
     * نام خانوادگی کاربر حقیقی را خروجی میدهد
     *
     * @return خروجی: نام خانوادگی کاربر حقیقی
     */
    @Override
    public String getFamily() {
        return "Gates";
    }
}
