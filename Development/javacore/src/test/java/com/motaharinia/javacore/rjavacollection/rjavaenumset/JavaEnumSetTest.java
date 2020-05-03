package com.motaharinia.javacore.rjavacollection.rjavaenumset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-enumset
 */
public class JavaEnumSetTest {
    //متغیر تست
    JavaEnumSet javaEnumSet;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaEnumSet = new JavaEnumSet();
    }

    /**
     * این متد AllOf - NoneOf ذر EnumSet در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaEnumSetAllOfNoneOfTest() throws Exception {
        Assertions.assertEquals("set1:[TUESDAY,WEDNESDAY,]set2:[SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,]set3:[]", javaEnumSet.allOfNoneOf());
    }
}
