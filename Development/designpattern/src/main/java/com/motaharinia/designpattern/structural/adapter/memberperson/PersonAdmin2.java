package com.motaharinia.designpattern.structural.adapter.memberperson;

import com.motaharinia.designpattern.structural.adapter.MemberPerson;

public class PersonAdmin2 implements MemberPerson {
    /**
     * نام کاربر حقیقی را خروجی میدهد
     *
     * @return خروجی: نام کاربر حقیقی
     */
    @Override
    public String getName() {
        return "Mostafa";
    }

    /**
     * نام خانوادگی کاربر حقیقی را خروجی میدهد
     *
     * @return خروجی: نام خانوادگی کاربر حقیقی
     */
    @Override
    public String getFamily() {
        return "Motaharinia";
    }
}
