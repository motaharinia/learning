package com.motaharinia.designpattern.structural.bridge;

public class TextFilterBold implements TextFilter {
    /**
     * این متد متن ورودی را پردازش مینماید
     *
     * @param text متن ورودی
     * @return خروجی: متن پردازش شده
     */
    @Override
    public String processText(String text) {
        return "<h3><b>" + text + "</b></h3>";
    }
}
