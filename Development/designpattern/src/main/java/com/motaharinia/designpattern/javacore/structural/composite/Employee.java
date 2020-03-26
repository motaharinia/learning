package com.motaharinia.designpattern.javacore.structural.composite;

public interface Employee {
    /**
     * شناسه کارمند را خروجی میدهد
     *
     * @return خروجی: شناسه کارمند
     */
    public Integer getId();

    /**
     * نام کارمند را خروجی میدهد
     *
     * @return خروجی: نام کارمند
     */
    public String getName();

    /**
     * حقوق کارمند را خروجی میدهد
     *
     * @return خروجی: حقوق کارمند
     */
    public Double getSalary();

    /**
     * این متد کارمند جدیدی به زیرمجموعه این کارمند اضافه میکند
     *
     * @param employee کارمند جدید زیرمجموعه
     */
    public void add(Employee employee);

    /**
     * این متد کارمندی را از زیرمجموعه این کارمند حذف میکند
     *
     * @param employee
     */
    public void remove(Employee employee);

    /**
     * این متد طبق ایندکس ، کارمندی از کارمندان زیرمجموعه را برمیگرداند
     *
     * @param i ایندکس کارمند
     * @return خروجی: کارمند مورد نظر
     */
    public Employee getChild(Integer i);
}
