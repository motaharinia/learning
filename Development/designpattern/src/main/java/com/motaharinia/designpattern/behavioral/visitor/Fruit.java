package com.motaharinia.designpattern.behavioral.visitor;

public class Fruit implements ItemElement {

    //قیمت هر کیلو
    private Integer pricePerKg;
    //وزن
    private Integer weight;
    //عنوان
    private String name;

    /**
     * متد سازنده
     *
     * @param pricePerKg قیمت هر کیلو
     * @param weight     وزن
     * @param name       نام
     */
    public Fruit(Integer pricePerKg, Integer weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    /**
     * این متد قیمت هر کیلو میوه را خروجی میدهد
     *
     * @return خروجی: قیمت هر کیلو
     */
    public Integer getPricePerKg() {
        return pricePerKg;
    }

    /**
     * این متد وزن میوه را خروجی میدهد
     *
     * @return خروجی: وزن
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * این متد نام میوه را خروجی میدهد
     *
     * @return خروجی: نام
     */
    public String getName() {
        return this.name;
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
