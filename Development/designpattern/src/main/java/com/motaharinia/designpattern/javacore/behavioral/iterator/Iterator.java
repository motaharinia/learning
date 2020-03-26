package com.motaharinia.designpattern.javacore.behavioral.iterator;

public interface Iterator {
    /**
     * این متد چک میکند آیتم بعدی دی کالکشن وجود دارد یا خیر
     *
     * @return خروجی: بولین
     */
    public Boolean hasNext();

    /**
     * این متد شیی بعدی در کالکشن را خروجی میدهد
     *
     * @return خروجی: شیی بعدی در کالکشن
     */
    public Object next();
}
