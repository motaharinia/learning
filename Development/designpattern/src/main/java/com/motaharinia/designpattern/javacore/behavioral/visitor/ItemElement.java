package com.motaharinia.designpattern.javacore.behavioral.visitor;

public interface ItemElement {
    /**
     * متد تایید خرید آیتم سبد خرید که هزینه خرید را خروجی میدهد
     *
     * @param visitor سبد خرید
     * @return خروجی: هزینه خرید آیتم
     */
    public Integer accept(ShoppingCartVisitor visitor);
}
