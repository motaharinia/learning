package com.motaharinia.designpattern.structural.flyweight;

public class Terrorist implements Player {

    // شرح کار بازیکن
    private final String TASK;

    // سلاح بازیکن
    private String weapon;

    /**
     * متد سازنده که شرح کار بازیکن را هم مشخص میکند
     */
    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    /**
     * یک اسلحه برای بازیکن بازی ست میکند
     *
     * @param weapon
     */
    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * نتیجه بازی بازیکن را خروجی میدهد
     *
     * @return خروجی: نتیجه بازی بازیکن
     */
    @Override
    public String mission() {
        return ("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }


}
