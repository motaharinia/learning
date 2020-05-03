package com.motaharinia.javacore.rjavacollection.hjavatreeset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-treeset
 */
public class JavaTreeSetTest {
    //متغیر تست
    JavaTreeSet javaTreeSet;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaTreeSet = new JavaTreeSet();
    }

    /**
     * این متد NavigableSet ذر Set در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaTreeSetNavigableSetTest() throws Exception {
        Assertions.assertEquals("[C, B]", javaTreeSet.navigableSet());
    }

}
