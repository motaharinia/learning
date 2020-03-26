package com.motaharinia.designpattern.javacore.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

//Caretaker class that will responsible for keeping the Memento.
//کلاسی که در قبال نگهداری یادآور وظیفه دارد
public class Caretaker {
    //لیست یادآورها
    private List<Memento> mementoList = new ArrayList<Memento>();

    /**
     * اضافه کننده یادآور جدید به لیست یادآورها
     *
     * @param memento یادآور
     */
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * دریافت یادآور بر اساس اندیس آن در لیست یادآورها
     *
     * @param index اندیس مورد نظر
     * @return خروجی: یادآور منطبق با اندیس
     */
    public Memento get(Integer index) {
        return mementoList.get(index);
    }
}
