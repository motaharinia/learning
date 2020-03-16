package com.motaharinia.designpattern.structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess {
    //نام کارمند شرکت
    private String employeeName;

    /**
     * متد سازنده که با نام کارمند ایجاد میشود
     *
     * @param employeeName
     */
    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * این متد به کارمندان یک شرکت دسترسی به اینترنت میدهد
     */
    @Override
    public void grantInternetAccess() {
        DataBase.employeeInternetAccessSet.add(this.employeeName);
    }
}
