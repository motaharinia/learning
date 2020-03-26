package com.motaharinia.designpattern.javacore.structural.decorator.shapedecorator;

public enum ColorEnum {
    RED("RED"),
    BLUE("BLUE"),
    GREEN("GREEN");

    //مقدار ثابت رنگ
    private String value;

    /**
     * مقدار ثابت رنگ را خروجی میدهد
     *
     * @return خروجی: مقدار ثابت رنگ
     */
    public String getValue() {
        return this.value;
    }

    /**
     * تابع سازنده ثابت رنگ از روی مقدار ثابت آن
     *
     * @param value مقدار ثابت رنگ
     */
    ColorEnum(String value) {
        this.value = value;
    }
}
