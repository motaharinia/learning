package com.motaharinia.designpattern.javacore.behavioral.chainofresponsibility;

public class IntegerProcessor implements Chain {

    //پردازنده بعدی در زنجیره پردازنده ها
    private Chain nextInChain;

    /**
     * این متد شیی پردازنده بعدی را بر روی شیی فعلی ست میکند که اگر شرایط شیی فعلی نتوانست ورودی را پردازش کند کار به پردازنده بعدی داده شود
     *
     * @param nextInChain پردازنده بعدی در زنجیر
     */
    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    /**
     * این متد ورودی را جهت پردازش دریافت میکند
     *
     * @param objectNumber
     */
    @Override
    public String process(Object objectNumber) {
        if (objectNumber != null && objectNumber instanceof Integer) {
            Integer number = (Integer) objectNumber;
            return ("IntegerProcessor:" + number.toString());
        } else {
            return (nextInChain.process(objectNumber));
        }
    }
}
