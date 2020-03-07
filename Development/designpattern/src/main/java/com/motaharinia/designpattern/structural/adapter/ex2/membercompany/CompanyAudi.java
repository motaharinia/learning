package com.motaharinia.designpattern.structural.adapter.ex2.membercompany;

import com.motaharinia.designpattern.structural.adapter.ex2.MemberCompany;

public class CompanyAudi implements MemberCompany {

    /**
     * نام شرکت را خروجی میدهد
     *
     * @return خروجی: نام شرکت
     */
    @Override
    public String getName() {
        return "AUDI";
    }
}
