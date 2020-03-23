package com.motaharinia.designpattern.behavioral.visitor;

public interface ShoppingCartVisitor {
    /**
     * این متد قیمت کتاب دریافتی را محاسبه میکند
     *
     * @param book کتاب مورد نظر
     * @return خروجی: قیمت محاسبه شده
     */
    Integer visit(Book book);

    /**
     * این متد قیمت میوه دریافتی را محاسبه میکند
     *
     * @param fruit میوه مورد نظر
     * @return خروجی: قیمت محاسبه شده
     */
    Integer visit(Fruit fruit);
}
