package com.motaharinia.javacore.rjavacollection.ojavatreemap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-treemap
 */
public class JavaTreeMapTest {
    //متغیر تست
    JavaTreeMap javaTreeMap;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaTreeMap = new JavaTreeMap();
    }

    /**
     * این متد NavigableMap ذر TreeMap در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaTreeMapNavigableMapTest() throws Exception {
        Assertions.assertEquals("{3=C, 2=B}", javaTreeMap.navigableMap());
    }

    /**
     * این متد SortedMap ذر TreeMap در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaTreeMapSortedMapTest() throws Exception {
        Assertions.assertEquals("{4=D, 5=E}", javaTreeMap.sortedMap());
    }

}
