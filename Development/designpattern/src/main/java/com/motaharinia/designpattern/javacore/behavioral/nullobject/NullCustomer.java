package com.motaharinia.designpattern.javacore.behavioral.nullobject;

public class NullCustomer extends AbstractCustomer {
    /**
     * این متد نشان میدهد مشتری مورد نظر واقعی است یا تهی
     *
     * @return خروجی: بولین
     */
    @Override
    public Boolean isNull() {
        return true;
    }

    /**
     * این متد نام مشتری را خروجی میدهد
     *
     * @return خروجی: نام مشتری
     */
    @Override
    public String getName() {
        return "Null";
    }
}
