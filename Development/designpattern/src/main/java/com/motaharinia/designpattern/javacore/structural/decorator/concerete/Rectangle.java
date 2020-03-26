package com.motaharinia.designpattern.javacore.structural.decorator.concerete;

import com.motaharinia.designpattern.javacore.structural.decorator.Shape;

public class Rectangle implements Shape {
    /**
     * نام شکل را خروجی میدهد
     *
     * @return خروجی: نام شکل
     */
    @Override
    public String getName() {
        return "Rectangle";
    }
}
