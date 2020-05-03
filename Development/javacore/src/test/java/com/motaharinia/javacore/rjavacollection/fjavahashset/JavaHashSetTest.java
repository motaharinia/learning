package com.motaharinia.javacore.rjavacollection.fjavahashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-hashset
 */
public class JavaHashSetTest {
    //متغیر تست
    JavaHashSet javaHashSet;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaHashSet = new JavaHashSet();
    }

    /**
     * این متد unique بودن عناصر ذر Set در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaHashSetIgoneDuplicateElementsTest() throws Exception {
        Assertions.assertEquals(1, javaHashSet.ignoringDuplicateElements());
    }

    /**
     * این متد RemoveIf ذر Set در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaHashSetRemoveIfTest() throws Exception {
        Assertions.assertEquals(1, javaHashSet.useRemoveIf());
    }
}
