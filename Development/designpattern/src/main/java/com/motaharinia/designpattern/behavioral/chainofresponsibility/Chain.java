package com.motaharinia.designpattern.behavioral.chainofresponsibility;

public interface Chain {
    /**
     * این متد شیی پردازنده بعدی را بر روی شیی فعلی ست میکند که اگر شرایط شیی فعلی نتوانست ورودی را پردازش کند کار به پردازنده بعدی داده شود
     * @param nextInChain پردازنده بعدی در زنجیر
     */
    public abstract void setNext(Chain nextInChain);

    /**
     * این متد ورودی را دریافت و پردازش میکند
     * @param objectNumber
     */
    public abstract String process(Object objectNumber);
}
