package com.motaharinia.designpattern.j2ee.business.businessdelegate;

public class EjbService implements BusinessService {
    /**
     * متد پردازشگر
     *
     * @return خروجی: نوع پردازش
     */
    @Override
    public String doProcessing() {
        return "EjbService";
    }
}
