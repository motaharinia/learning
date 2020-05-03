package com.motaharinia.javacore.rjavacollection.bjavaarraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.javatpoint.com/java-arraylist
 */
public class JavaArrayListTest {
    //متغیر تست
    JavaArrayList javaArrayList;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaArrayList = new JavaArrayList();
    }

    /**
     * این متد پیمایش لیست آرایه با ForEach را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaArrayListForEachTest() throws Exception {
        Assertions.assertEquals(true, javaArrayList.checkValueIsExistForEach("Motaharinia"));
    }

    /**
     * این متد serialize و deserialize لیست آرایه را در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaArrayListSerializeDeserializeTest() throws Exception {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Motaharinia");
        arrayList.add("Vijay");
        arrayList.add("Ajay");
        ReflectionAssert.assertReflectionEquals(arrayList, javaArrayList.serializeDeserialize(arrayList));
    }

    /**
     * این متد به دست آوردن اشتراک دو لیست آرایه را توسط retailAll در مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaArrayListRetailAllTest() throws Exception {
        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("Motaharinia");
        arrayList1.add("Vijay");
        arrayList1.add("Ajay");
        ArrayList<String> arrayList2=new ArrayList<String>();
        arrayList2.add("Motaharinia");
        arrayList2.add("Ajay");
        arrayList2.add("Test");
        ReflectionAssert.assertReflectionEquals(Arrays.asList("Motaharinia","Ajay"), javaArrayList.useRetainAll(arrayList1,arrayList2));
    }
}
