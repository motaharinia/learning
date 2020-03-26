package com.motaharinia.designpattern.javacore.behavioral.nullobject;

public class RealCustomer extends AbstractCustomer {
    /**
     * متد سازنده
     * @param name نام مشتری
     */
    public RealCustomer(String name) {
        this.name = name;
    }


    /**
     * این متد نشان میدهد مشتری مورد نظر واقعی است یا تهی
     *
     * @return خروجی: بولین
     */
    @Override
    public Boolean isNull() {
        return false;
    }

    /**
     * این متد نام مشتری را خروجی میدهد
     *
     * @return خروجی: نام مشتری
     */
    @Override
    public String getName() {
        return name;
    }
}
