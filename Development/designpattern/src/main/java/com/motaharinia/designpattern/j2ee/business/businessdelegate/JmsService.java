package com.motaharinia.designpattern.j2ee.business.businessdelegate;

public class JmsService implements BusinessService {
    /**
     * متد پردازشگر
     *
     * @return خروجی: نوع پردازش
     */
    @Override
    public String doProcessing() {
        return "JmsService";
    }
}
