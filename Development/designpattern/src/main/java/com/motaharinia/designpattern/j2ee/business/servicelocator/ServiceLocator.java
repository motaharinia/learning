package com.motaharinia.designpattern.j2ee.business.servicelocator;

public class ServiceLocator {
    //کش
    private static Cache cache;

    /**
     * متد سازنده استاتیک
     */
    static {
        cache = new Cache();
    }

    /**
     * متد جستجو کننده سرویس بر اساس کش و در غیر این صورت سرویس جدید بیرون میدهد
     *
     * @param name نام سرویس
     * @return خروجی: سرویس مورد نظر
     */
    public static Service getService(String name) {
        Service service = cache.getService(name);
        if (service != null) {
            return service;
        } else {
            InitialContext context = new InitialContext();
            service = (Service) context.lookup(name);
            cache.addService(service);
            return service;
        }
    }
}
