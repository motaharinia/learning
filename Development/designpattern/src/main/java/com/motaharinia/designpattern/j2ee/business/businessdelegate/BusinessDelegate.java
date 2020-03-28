package com.motaharinia.designpattern.j2ee.business.businessdelegate;

public class BusinessDelegate {
    //جستجو کننده سرویس تجاری
    private BusinessLookUp lookupService = new BusinessLookUp();
    //سرویس تجاری
    private BusinessService businessService;
    //نوع سرویس
    private String serviceType;

    /**
     * متد ست کننده نوع سرویس
     *
     * @param serviceType نوع سرویس
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * متد انجام دهنده تسک بر اساس نوع سرویس
     */
    public String doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        return businessService.doProcessing();
    }
}
