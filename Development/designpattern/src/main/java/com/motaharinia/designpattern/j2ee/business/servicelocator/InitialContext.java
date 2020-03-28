package com.motaharinia.designpattern.j2ee.business.servicelocator;

public class InitialContext {
    /**
     * جستجو کننده و خروجی دهنده سرویس بر اساس نام آن
     * @param name نام سرویس
     * @return خروجی: سرویس مورد نظر
     */
    public Object lookup(String name) {
        if (name.equalsIgnoreCase("ServiceOne")) {
            return new ServiceOne();
        } else if (name.equalsIgnoreCase("ServiceTwo")) {
            return new ServiceTwo();
        }
        return null;
    }
}
