package com.motaharinia.javacore.rjavacollection.kjavamapinterface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.javatpoint.com/java-map
 */
public class JavaMapInterfaceTest {
    //متغیر تست
    JavaMapInterface javaMapInterface;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaMapInterface = new JavaMapInterface();
    }

    /**
     * این متد پیمایش NonGeneric به روش قدیمی را ذر Map مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaMapInterfaceNonGenericTest() throws Exception {
        Map map = new HashMap();
        map.put(1, "Motaharinia");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        Assertions.assertEquals("1:Motaharinia2:Jai5:Rahul6:Amit", javaMapInterface.nonGenericOldStyle(map));
    }

    /**
     * این متد پیمایش Generic به روش جدید را ذر Map مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaMapInterfaceGenericTest() throws Exception {
        Map map = new HashMap();
        map.put(1, "Motaharinia");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        Assertions.assertEquals("1:Motaharinia2:Jai5:Rahul6:Amit", javaMapInterface.genericNewStyle(map));
    }

    /**
     * این متد پیمایش ComparingByKey با مرتب سازی نزولی را ذر Map مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaMapInterfaceComparingByKeyTest() throws Exception {
        Map map = new HashMap();
        map.put(1, "Motaharinia");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        Assertions.assertEquals("6:Amit,5:Rahul,2:Jai,1:Motaharinia", javaMapInterface.comparingByKeyTest(map));
    }


    /**
     * این متد پیمایش ComparingByValue با مرتب سازی نزولی را ذر Map مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaMapInterfaceComparingByValueTest() throws Exception {
        Map map = new HashMap();
        map.put(1, "Motaharinia");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        Assertions.assertEquals("5:Rahul,1:Motaharinia,2:Jai,6:Amit", javaMapInterface.comparingByValueTest(map));
    }
}
