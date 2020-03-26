package com.motaharinia.designpattern.javacore.structural.decorator.shapedecorator;

import com.motaharinia.designpattern.javacore.structural.decorator.Shape;
import com.motaharinia.designpattern.javacore.structural.decorator.ShapeDecorator;

public class FillColorDecorator extends ShapeDecorator {
    protected ColorEnum color;

    /**
     * متد سازنده دکوراتور
     *
     * @param decoratedShape شکلی که میخواهیم آن را دکوراتیو کنیم
     * @param color          رنگی که میخواهیم آن را به داخل شکل خود بدهیم
     */
    public FillColorDecorator(Shape decoratedShape, ColorEnum color) {
        super(decoratedShape);
        this.color = color;
    }

    /**
     * نام شکل را خروجی میدهد
     *
     * @return خروجی: نام شکل
     */
    @Override
    public String getName() {
        return decoratedShape.getName() + " FillColor: " + color.getValue() ;
    }
}
