package com.motaharinia.designpattern.javacore.behavioral.visitor;

public class Book implements ItemElement {

    //قیمت
    private Integer price;
    //شماره سریال
    private String isbnNumber;


    /**
     * متد سازنده
     *
     * @param cost قیمت
     * @param isbn شماره سریال
     */
    public Book(int cost, String isbn) {
        this.price = cost;
        this.isbnNumber = isbn;
    }

    /**
     * این متد قیمت کتاب را خروجی میدهد
     *
     * @return خروجی: قیمت
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * این متد شماره سریال کتاب را خروجی میدهد
     *
     * @return خروجی: شماره سریال
     */
    public String getIsbnNumber() {
        return isbnNumber;
    }


    /**
     * متد تایید خرید آیتم سبد خرید که هزینه خرید را خروجی میدهد
     *
     * @param visitor سبد خرید
     * @return خروجی: هزینه خرید آیتم
     */
    @Override
    public Integer accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
