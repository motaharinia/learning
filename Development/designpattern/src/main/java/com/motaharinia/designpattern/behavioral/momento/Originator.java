package com.motaharinia.designpattern.behavioral.momento;

// Originator class that will use Memento object to restore its previous state.
//کلاسی که از کلاس یادآور برای برگرداندن وضعیت قبلی اش استفاده میکند
public class Originator {
    //وضعیت
    private String state;

    /**
     * متد ست کننده وضعیت
     *
     * @param state وضعیت
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * متد دریافت وضعیت
     *
     * @return خروجی: وضعیت
     */
    public String getState() {
        return state;
    }

    /**
     * این متد وضعیت کلاس را به صورت یادآور بیرون میدهد
     *
     * @return خروجی: یادآور با وضعیت داده شده
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * این متد یادآور را دریافت و وضعیت آن را در کلاس ست میکند
     *
     * @param Memento یادآور
     */
    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
