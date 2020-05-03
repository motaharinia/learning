package com.motaharinia.javacore.rjavacollection.ypropertiesclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/properties-class-in-java
 */
public class PropertiesClassTest {
    //متغیر تست
    PropertiesClass propertiesClass;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        propertiesClass = new PropertiesClass();
    }

    /**
     * این متد propertiesClass را با خواندن از application.properties در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void propertiesClassReadApplicationPropertiesTest() throws Exception {
        Assertions.assertEquals("JavaCore", propertiesClass.readApplicationPropertiesValueByKey("spring.application.name"));
    }

    /**
     * این متد propertiesClass را با خواندن از system properties در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void propertiesClassReadSystemPropertiesTest() throws Exception {
        Assertions.assertEquals("Oracle Corporation", propertiesClass.readSystemPropertiesValueByKey("java.vm.vendor"));
    }
}
