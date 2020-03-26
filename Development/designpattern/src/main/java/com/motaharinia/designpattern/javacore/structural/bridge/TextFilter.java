package com.motaharinia.designpattern.javacore.structural.bridge;

public interface TextFilter {
    /**
     * این متد متن ورودی را پردازش مینماید
     * @param text متن ورودی
     * @return خروجی: متن پردازش شده
     */
    public abstract String processText(String text);
}
