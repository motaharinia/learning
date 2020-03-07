package com.motaharinia.designpattern.creational.singleton.early;

public class EarlySingleton {
    private static EarlySingleton earlySingleton = new EarlySingleton();

    /**
     * متد سازنده پیش فرض
     */
    private EarlySingleton() {
    }

    /**
     * این متد یک نمونه سینگلتون از این کلاس را که در زمان اجرای پروژه به صورت early ایجاد شده است را خروجی میدهد
     *
     * @return خروجی: یک آبجکت سینگتون از خود کلاس
     */
    public static EarlySingleton getInstance() {
        return earlySingleton;
    }
}
