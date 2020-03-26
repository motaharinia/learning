package com.motaharinia.designpattern.javacore.behavioral.nullobject;

public class CustomerFactory {
    public static final String[] realCustomerNameArray = {"Rob", "Joe", "Julie"};

    /**
     * این متد در صورتی که نام ورودی آن در لیست مشتریان واقعی باشد در خروجی مشتری واقعی میدهد در غیر این صورت خروجی مشتری Null میدهد
     * @param name نام مشتری
     * @return خروجی: مشتری
     */
    public static AbstractCustomer getCustomer(String name) {
        for (Integer i = 0; i < realCustomerNameArray.length; i++) {
            if (realCustomerNameArray[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
