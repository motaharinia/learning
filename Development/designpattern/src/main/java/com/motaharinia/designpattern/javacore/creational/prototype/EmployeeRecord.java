package com.motaharinia.designpattern.javacore.creational.prototype;

//اطلاعات کارمند
public class EmployeeRecord implements Prototype {
    //شناسه کارمند
    private Integer id;
    //نام و نقش کارمند
    private String name, designation;
    //میزان حقوق کارمند
    private Double salary;
    //نشانی کارمند
    private String address;


    /**
     * تابع سازنده که طبق ورودی شیی یک کارمند را ایجاد میکند
     *
     * @param id          شناسه کارمند
     * @param name        نام  کارمند
     * @param designation نقش کارمند
     * @param salary      میزان حقوق کارمند
     * @param address     نشانی کارمند
     */
    public EmployeeRecord(Integer id, String name, String designation, Double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }


    /**
     * یک شیی جدید از روی شیی فعلی ایجاد و خروجی میدهد
     *
     * @return خروجی: یک شیی جدید کپی شده از شیی فعلی
     */
    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }

}
