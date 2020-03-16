package com.motaharinia.designpattern.structural.flyweight;

public interface Player {
    /**
     * یک اسلحه برای بازیکن بازی ست میکند
     * @param weapon
     */
    public void assignWeapon(String weapon);

    /**
     * نتیجه بازی بازیکن را خروجی میدهد
     * @return خروجی: نتیجه بازی بازیکن
     */
    public String mission();
}
