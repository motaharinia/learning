package com.motaharinia.javacore.rjavacollection.acollectionframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/collections-in-java
 */
public class CollectionFrameworkTest {
    //متغیر تست
    CollectionFramework collectionFramework;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        collectionFramework = new CollectionFramework();
    }

    /**
     * این متد پیمایش مجموعه از نوع ArrayList را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInArrayListTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInArrayList("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع LinkedList را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInLinkedListTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInLinkedList("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع Vector را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInVectorTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInVector("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع Stack را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInStackTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInStack("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع PriorityQueue را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInPriorityQueueTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInPriorityQueue("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع ArrayDeque را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInArrayDequeTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInArrayDeque("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع HashSet را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInHashSetTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInHashSet("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع LinkedHashSet را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInLinkedHashSetTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInLinkedHashSet("Motaharinia"));
    }

    /**
     * این متد پیمایش مجموعه از نوع TreeSet را در جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void collectionFrameworkCheckValueIsExistInTreeSetTest() throws Exception {
        Assertions.assertEquals(true, collectionFramework.checkValueIsExistInTreeSet("Motaharinia"));
    }
}
