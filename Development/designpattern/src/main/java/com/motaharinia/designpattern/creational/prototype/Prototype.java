package com.motaharinia.designpattern.creational.prototype;

public interface Prototype {
    /**
     * یک شیی جدید از روی شیی فعلی ایجاد و خروجی میدهد
     *
     * @return خروجی: یک شیی جدید کپی شده از شیی فعلی
     */
    public Prototype getClone();
}
