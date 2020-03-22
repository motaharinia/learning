package com.motaharinia.designpattern.behavioral.momento;

//class that will Store internal state of the Originator object.
//کلاسی که وضعیت داخلی Originator را ذخیره میکند
public class Memento {
    //وضعیت
    private String state;

    /**
     * متد سازنده که با ورودی وضعیت آن را داخل یادآور ست میکند
     *
     * @param state وضعیت
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * این متد وضعیت داخل یادآور را خروجی میدهد
     *
     * @return
     */
    public String getState() {
        return state;
    }
}
