package com.motaharinia.designpattern.structural.bridge;

public class TextContentHeader extends TextContent {
    /**
     * متد سازنده که استفاده کننده را مجبور به داشتن حتما دو فیلتر روی متن میکند
     *
     * @param text        متن
     * @param textFilter1 فیلتر متنی اول
     * @param textFilter2 فیلتر متنی دوم
     */
    public TextContentHeader(String text, TextFilter textFilter1, TextFilter textFilter2) {
        super(text, textFilter1, textFilter2);
    }

    /**
     * این متد فیلتر را روی محتویات متن اعمال میکند و متن را برای گذاشته شدن روی وب آماده میکند
     *
     * @return خروجی: متن فیلتر شده و آمده شده برای وب
     */
    @Override
    public String filter() {
        return textFilter2.processText(textFilter1.processText(this.text));
    }
}
