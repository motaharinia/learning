package com.motaharinia.designpattern.javacore.structural.adapter;

public class MemberAdapter  implements  MemberCompany {
    private MemberPerson memberPerson;

    public MemberAdapter(MemberPerson memberPerson) {
        this.memberPerson = memberPerson;
    }

    /**
     * نام شرکت یا کاربر حقیقی را خروجی میدهد
     *
     * @return خروجی: نام شرکت یا کاربر حقیقی
     */
    @Override
    public String getName() {
        return memberPerson.getName() + " " + memberPerson.getFamily();
    }
}
