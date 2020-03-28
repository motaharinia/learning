package com.motaharinia.designpattern.j2ee.business.servicelocator;

public class ServiceOne implements Service {
    /**
     * دریافت کننده نام سرویس
     *
     * @return
     */
    @Override
    public String getName() {
        return "ServiceOne";
    }

}
