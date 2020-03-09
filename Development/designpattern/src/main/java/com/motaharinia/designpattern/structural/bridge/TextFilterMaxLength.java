package com.motaharinia.designpattern.structural.bridge;

public class TextFilterMaxLength implements TextFilter {
    /**
     * این متد متن ورودی را پردازش مینماید
     *
     * @param text متن ورودی
     * @return خروجی: متن پردازش شده
     */
    @Override
    public String processText(String text) {
        if(text==null){
            text="";
        }
        if(text.length()>25){
            return text.substring(0,25) + "...";
        }else{
            return text;
        }
    }
}
