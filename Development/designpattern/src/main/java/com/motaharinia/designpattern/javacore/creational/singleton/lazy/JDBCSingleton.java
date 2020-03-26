package com.motaharinia.designpattern.javacore.creational.singleton.lazy;

public class JDBCSingleton {
    //فیلد استاتیک که یک شیی از کلاس را در خود نگهداری میکند
    private static JDBCSingleton jdbc;

    /**
     * این تابع سارنده از نمونه گیری کردن از این کلاس در هر کلاس دیگر جلوگیری میکند
     */
    private JDBCSingleton() {
    }

    //Now we are providing global point of access.

    /**
     * این متد یک نمونه شیی سینگلتون در زمانی که به ان نیاز باشد ایجاد و خروجی میدهد
     * این متد را synchronized کرده ام که به صورت موازی نتوان آن را اجرا کرد و از آن دو شیی دریافت کرد
     * @return خروجی: یک نمونه شیی سینگلتون از این کلاس
     */
    public synchronized static JDBCSingleton getInstance() {
        if (jdbc == null) {
            jdbc = new JDBCSingleton();
        }
        return jdbc;
    }
}
