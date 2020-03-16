package com.motaharinia.designpattern.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
    //نام کارمند شرکت
    private String employeeName;

    //آبجکت واقعی و اصلی دسترسی اینترنت کارمند شرکت
    private RealInternetAccess realInternetAccess;

    /**
     * متد سازنده که با نام کارمند ایجاد میشود
     *
     * @param employeeName
     */
    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * این متد به کارمندان یک شرکت دسترسی به اینترنت میدهد
     */
    @Override
    public void grantInternetAccess() {
        if (DataBase.employeeRoleHashMap.containsKey(this.employeeName) && DataBase.employeeRoleHashMap.get(this.employeeName) > 9) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }
    }
}
