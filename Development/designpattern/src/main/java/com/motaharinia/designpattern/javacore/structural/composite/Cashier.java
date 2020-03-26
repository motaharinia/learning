package com.motaharinia.designpattern.javacore.structural.composite;

public class Cashier implements Employee {

    //شناسه کارمند
    private Integer id;
    //نام کارمند
    private String name;
    //حقوق کارمند
    private Double salary;

    /**
     * متد سازنده
     *
     * @param id     شناسه کارمند
     * @param name   نام کارمند
     * @param salary حقوق کارمند
     */
    public Cashier(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    /**
     * شناسه کارمند را خروجی میدهد
     *
     * @return خروجی: شناسه کارمند
     */
    @Override
    public Integer getId() {
        return this.id;
    }

    /**
     * نام کارمند را خروجی میدهد
     *
     * @return خروجی: نام کارمند
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * حقوق کارمند را خروجی میدهد
     *
     * @return خروجی: حقوق کارمند
     */
    @Override
    public Double getSalary() {
        return this.salary;
    }


    //
    //چون این کارمند در سلسله مراتب Composite Design Pattern از نوع Leaf هست متدهای زیر که برای مدیریت کارمندان زیرمجموعه بوده استفاده نمیشوند
    //


    /**
     * این متد کارمند جدیدی به زیرمجموعه این کارمند اضافه میکند
     *
     * @param employee کارمند جدید زیرمجموعه
     */
    @Override
    public void add(Employee employee) {

    }

    /**
     * این متد کارمندی را از زیرمجموعه این کارمند حذف میکند
     *
     * @param employee
     */
    @Override
    public void remove(Employee employee) {

    }

    /**
     * این متد طبق ایندکس ، کارمندی از کارمندان زیرمجموعه را برمیگرداند
     *
     * @param i ایندکس کارمند
     * @return خروجی: کارمند مورد نظر
     */
    @Override
    public Employee getChild(Integer i) {
        return null;
    }
}
