package com.motaharinia.designpattern.structural.decorator.shapedecorator;

import com.motaharinia.designpattern.structural.decorator.Shape;
import com.motaharinia.designpattern.structural.decorator.ShapeDecorator;

public class BorderColorDecorator extends ShapeDecorator {
    protected ColorEnum color;

    /**
     * متد سازنده دکوراتور
     *
     * @param decoratedShape شکلی که میخواهیم آن را دکوراتیو کنیم
     * @param color          رنگی که میخواهیم آن را به لبه شکل خود بدهیم
     */
    public BorderColorDecorator(Shape decoratedShape, ColorEnum color) {
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
        return decoratedShape.getName() + " BorderColor: " + color.getValue() ;
    }
}
