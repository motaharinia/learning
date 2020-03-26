package com.motaharinia.designpattern.javacore.behavioral.nullobject;

public abstract class AbstractCustomer {
    //نام مشتری
    protected String name;

    /**
     * این متد نشان میدهد مشتری مورد نظر واقعی است یا تهی
     * @return خروجی: بولین
     */
    public abstract Boolean isNull();

    /**
     * این متد نام مشتری را خروجی میدهد
     * @return خروجی: نام مشتری
     */
    public abstract String getName();
}
