package com.motaharinia.designpattern.j2ee.business.businessdelegate;

public class Client {
    //نماینده تجاری
    BusinessDelegate businessService;

    /**
     * متد سازنده
     *
     * @param businessService نماینده تجاری
     */
    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    /**
     * دستور انجام تسک
     */
    public String doTask() {
        return businessService.doTask();
    }
}
