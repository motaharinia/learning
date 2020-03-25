package com.motaharinia.designpattern.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    /**
     * این متد قیمت کتاب دریافتی را محاسبه میکند
     *
     * @param book کتاب مورد نظر
     * @return خروجی: قیمت محاسبه شده
     */
    @Override
    public Integer visit(Book book) {
        Integer cost = 0;
        //اگر قیمت محصول از 50 بیشتر باشد 5یورو تخفیف لحاظ کنیم
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }
        return cost;

    }

    /**
     * این متد قیمت میوه دریافتی را محاسبه میکند
     *
     * @param fruit میوه مورد نظر
     * @return خروجی: قیمت محاسبه شده
     */
    @Override
    public Integer visit(Fruit fruit) {
        Integer cost = fruit.getPricePerKg() * fruit.getWeight();
        return cost;
    }
}
