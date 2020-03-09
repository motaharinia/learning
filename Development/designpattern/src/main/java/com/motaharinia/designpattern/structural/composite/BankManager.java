package com.motaharinia.designpattern.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {

    //شناسه کارمند
    private Integer id;
    //نام کارمند
    private String name;
    //حقوق کارمند
    private Double salary;
    //کارمندان زیرمجموعه
    private List<Employee> employeeList = new ArrayList<Employee>();

    /**
     * متد سازنده
     *
     * @param id     شناسه کارمند
     * @param name   نام کارمند
     * @param salary حقوق کارمند
     */
    public BankManager(Integer id, String name, Double salary) {
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

    /**
     * این متد کارمند جدیدی به زیرمجموعه این کارمند اضافه میکند
     *
     * @param employee کارمند جدید زیرمجموعه
     */
    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    /**
     * این متد کارمندی را از زیرمجموعه این کارمند حذف میکند
     *
     * @param employee
     */
    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    /**
     * این متد طبق ایندکس ، کارمندی از کارمندان زیرمجموعه را برمیگرداند
     *
     * @param i ایندکس کارمند
     * @return خروجی: کارمند مورد نظر
     */
    @Override
    public Employee getChild(Integer i) {
        return employeeList.get(i);
    }
}
