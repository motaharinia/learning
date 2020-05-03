package com.motaharinia.javacore.rjavacollection.vcomparableinterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/Comparable-interface-in-collection-framework
 */
public class JavaComparableTest {
    //متغیر تست
    JavaComparable javaComparable;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaComparable = new JavaComparable();
    }

    /**
     * این متد sort را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaComparableTest() throws Exception {
        Assertions.assertEquals("Ajay,Motaharinia,Jai", javaComparable.sortUserDefinedObject());
    }
}
