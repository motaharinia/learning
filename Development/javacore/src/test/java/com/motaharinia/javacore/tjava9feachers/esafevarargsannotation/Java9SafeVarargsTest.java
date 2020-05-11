package com.motaharinia.javacore.tjava9feachers.esafevarargsannotation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.javatpoint.com/java-9-safevarargs-annotation
 */
public class Java9SafeVarargsTest {
    //متغیر تست
    Java9SafeVarargs java9SafeVarargs;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        java9SafeVarargs = new Java9SafeVarargs();
    }

    /**
     * این متد ، استفاده از انوتیشن @SafeVarargs در متد که پارامترهای varargs را می گیرد را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9SafeVarargsTest() throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        Assertions.assertEquals("LaptopTabletLaptopTabletLaptopTablet", java9SafeVarargs.display1(list,list,list));
    }
}
