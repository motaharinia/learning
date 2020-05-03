package com.motaharinia.javacore.rjavacollection.usortingcollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/Sorting-in-collection-framework
 */
public class SortingInCollectionTest {
    //متغیر تست
    SortingInCollection sortingInCollection;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        sortingInCollection = new SortingInCollection();
    }

    /**
     * این متد sort را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void sortingInCollectionTest() throws Exception {
        Assertions.assertEquals("Tahir,Saurav,Mukesh,Motaharinia", sortingInCollection.sortUserDefinedObject());
    }
}
