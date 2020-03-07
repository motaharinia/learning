package com.motaharinia.designpattern.structural.adapter.membercompany;

import com.motaharinia.designpattern.structural.adapter.MemberCompany;

public class CompanyBmw implements MemberCompany {
    /**
     * نام شرکت را خروجی میدهد
     *
     * @return خروجی: نام شرکت
     */
    @Override
    public String getName() {
        return "BMW";
    }
}
