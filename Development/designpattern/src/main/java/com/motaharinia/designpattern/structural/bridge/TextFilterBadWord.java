package com.motaharinia.designpattern.structural.bridge;

import java.util.Arrays;
import java.util.List;

public class TextFilterBadWord implements  TextFilter {

    private List<String> badWordList= Arrays.asList("Kill", "damn", "shit");

    /**
     * این متد متن ورودی را پردازش مینماید
     *
     * @param text متن ورودی
     * @return خروجی: متن پردازش شده
     */
    @Override
    public String processText(String text) {
        for (String badWord:badWordList) {
            text=text.replaceAll("(?i)"+badWord,"BAD_WORD");
        }
        return text;
    }
}
