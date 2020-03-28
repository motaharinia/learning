package com.motaharinia.designpattern.j2ee.business.businessdelegate;

public class BusinessLookUp {
    /**
     * بر اساس نوع سرویس ورودی ، سرویس مورد نظر را خروجی میدهد
     *
     * @param serviceType نوع سرویس
     * @return خروجی: سرویس ورودی
     */
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EjbService();
        } else {
            return new JmsService();
        }
    }
}
