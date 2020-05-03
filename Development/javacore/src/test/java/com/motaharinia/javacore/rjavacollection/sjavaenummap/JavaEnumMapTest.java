package com.motaharinia.javacore.rjavacollection.sjavaenummap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-enummap
 */
public class JavaEnumMapTest {
    //متغیر تست
    JavaEnumMap javaEnumMap;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaEnumMap = new JavaEnumMap();
    }

    /**
     * این متد Iteration ذر EnumMap در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaEnumMapIterationTest() throws Exception {
        Assertions.assertEquals("MONDAY:1,TUESDAY:2,WEDNESDAY:3,THURSDAY:4,", javaEnumMap.iteration());
    }
}
