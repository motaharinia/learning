package com.motaharinia.designpattern.structural.decorator;

public abstract class ShapeDecorator implements Shape {
    //شکلی که میخواهیم آن را دکوراتیو کنیم
    protected Shape decoratedShape;

    /**
     * متد سازنده دکوراتور
     *
     * @param decoratedShape شکلی که میخواهیم آن را دکوراتیو کنیم
     */
    public ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }
}
