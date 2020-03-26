package com.motaharinia.designpattern.javacore.structural.bridge;

public abstract class TextContent {
    //متن
    protected  String text;
    //فیلتر اول روی متن
    protected TextFilter textFilter1;
    //فیلتر دوم روی متن
    protected TextFilter textFilter2;

    /**
     * متد سازنده که استفاده کننده را مجبور به داشتن حتما دو فیلتر روی متن میکند
     *
     * @param text متن
     * @param textFilter1 فیلتر متنی اول
     * @param textFilter2 فیلتر متنی دوم
     */
    protected TextContent(String text,TextFilter textFilter1, TextFilter textFilter2) {
        this.text=text;
        this.textFilter1 = textFilter1;
        this.textFilter2 = textFilter2;
    }

    /**
     * این متد فیلتر را روی محتویات متن اعمال میکند و متن را برای گذاشته شدن روی وب آماده میکند
     *
     * @return خروجی: متن فیلتر شده و آمده شده برای وب
     */
    abstract public String filter();
}
