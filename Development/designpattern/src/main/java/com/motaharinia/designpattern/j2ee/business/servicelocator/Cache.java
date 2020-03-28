package com.motaharinia.designpattern.j2ee.business.servicelocator;

import java.util.HashMap;

public class Cache {
    private HashMap<String, Service> serviceHashMap = new HashMap<>();

    /**
     * این متد سرویس مورد نظر را در صورتی که از قبل در کش ثبت شده باشد خروجی میدهد
     *
     * @param serviceName نام سرویس
     * @return خروجی: سرویس مورد نظر
     */
    public Service getService(String serviceName) {
        if (serviceHashMap.containsKey(serviceName)) {
            return serviceHashMap.get(serviceName);
        } else {
            return null;
        }
    }

    /**
     * این متد سرویس جدید را به کش اضافه مینماید
     *
     * @param newService سرویس جدید
     */
    public void addService(Service newService) {
        if (!serviceHashMap.containsKey(newService.getName())) {
            serviceHashMap.put(newService.getName(), newService);
        }
    }
}
