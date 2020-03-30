package com.motaharinia.designpattern.j2ee.business.businessdelegate;

public class Client {
    //نماینده تجاری
    BusinessDelegate businessDelegate;

    /**
     * متد سازنده
     *
     * @param businessDelegate نماینده تجاری
     */
    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    /**
     * دستور انجام تسک
     */
    public String doTask() {
        return businessDelegate.doTask();
    }
}
