package com.motaharinia.javacore.rjavacollection.njavalinkedhashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.javatpoint.com/java-linkedhashmap
 *
 *
 */
public class JavaLinkedHashMapTest {
    //متغیر تست
    JavaLinkedHashMap javaLinkedHashMap;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaLinkedHashMap = new JavaLinkedHashMap();
    }

    /**
     * این متد پیمایش KeySet را ذر LinkedHashMap مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaLinkedHashMapKeySetTest() throws Exception {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "Motaharinia");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        System.out.println(map.keySet().stream().map(e->e.toString()).collect(Collectors.joining("")));
        Assertions.assertEquals(map.keySet().stream().map(e->e.toString()).collect(Collectors.joining("")), javaLinkedHashMap.getKeySet(map));
    }

    /**
     * این متد پیمایش Values را ذر LinkedHashMap مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaLinkedHashMapValuesTest() throws Exception {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "Motaharinia");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        System.out.println(map.values().stream().map(e->e.toString()).collect(Collectors.joining("")));
        Assertions.assertEquals(map.values().stream().map(e->e.toString()).collect(Collectors.joining("")), javaLinkedHashMap.getValueSet(map));
    }


    /**
     * این متد پیمایش  Values در حالت اشیا را ذر LinkedHashMap مجموعه جاوا تست میکند
     *
     * @throws Exception
     */
    @Test
    public void javaLinkedHashMapObjectValuesTest() throws Exception {
        LinkedHashMap<Integer, JavaLinkedHashMapBook> map = new LinkedHashMap<Integer, JavaLinkedHashMapBook>();
        map.put(1, new JavaLinkedHashMapBook(1,"Motaharinia"));
        map.put(5, new JavaLinkedHashMapBook(5,"Rahul"));
        map.put(2, new JavaLinkedHashMapBook(2,"Jai"));
        map.put(6, new JavaLinkedHashMapBook(6,"Amit"));
        System.out.println(map.values().stream().map(e->e.getName()).collect(Collectors.joining("")));
        Assertions.assertEquals(map.values().stream().map(e->e.getName()).collect(Collectors.joining("")), javaLinkedHashMap.getObjectValueSet(map));
    }
}
