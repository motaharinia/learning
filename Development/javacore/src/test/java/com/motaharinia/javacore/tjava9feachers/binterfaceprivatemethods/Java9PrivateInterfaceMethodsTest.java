package com.motaharinia.javacore.tjava9feachers.binterfaceprivatemethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-9-interface-private-methods
 */
public class Java9PrivateInterfaceMethodsTest {
    //متغیر تست
    Java9PrivateInterfaceMethods java9PrivateInterfaceMethods;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        java9PrivateInterfaceMethods = new Java9PrivateInterfaceMethods();
    }

    /**
     * این متد ، متد خصوصی استاتیک در اینترفیس را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9PrivateInterfaceMethodsTest() throws Exception {
        Assertions.assertEquals("I'm private method.I'm private static method.", java9PrivateInterfaceMethods.say());
    }
}
