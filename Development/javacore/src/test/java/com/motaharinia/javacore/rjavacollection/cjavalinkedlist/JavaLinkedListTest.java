package com.motaharinia.javacore.rjavacollection.cjavalinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-linkedlist
 */
public class JavaLinkedListTest {
    //متغیر تست
    JavaLinkedList javaLinkedList;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaLinkedList = new JavaLinkedList();
    }

    /**
     * این متد پیمایش لیست آرایه با ForEach را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaLinkedListTest() throws Exception {
        Assertions.assertEquals("Ajay,Vijay,Motaharinia,", javaLinkedList.reverseIterator());
    }

}
