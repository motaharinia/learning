package com.motaharinia.javacore.fjavaarray;

import com.motaharinia.javacore.djavaabstraction.binterface.PaperA4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

//https://www.javatpoint.com/array-in-java
public class JavaArrayTest {

    //متغیر تست
    JavaArray javaArray;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaArray = new JavaArray();
    }

    /**
     * این متد پیاده سازی قابلیت Anonymous Array را در فراخوانی متد تست میکند
     */
    @Test
    void javaArrayAnonymousArrayTest() {
        Assertions.assertEquals("1234", javaArray.getAnonymousArray(new Integer[]{1, 2, 3, 4}));
    }

    /**
     * این متد نام کلاس آرایه جاوا را خوانده و تست میکند
     */
    @Test
    void javaArrayGetClassName() {
        Assertions.assertEquals("[Ljava.lang.Integer;", javaArray.javaArrayGetClassName());
    }


    /**
     * این متد کپی آرایه جاوا را تست میکند
     */
    @Test
    void javaArrayCopy() {
        char[] arrayFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] arrayTo = new char[7];
        System.arraycopy(arrayFrom, 2, arrayTo, 0, 7);
        Assertions.assertEquals("caffein", String.valueOf(arrayTo));
    }

    /**
     * این متد clone کردن آرایه جاوا را تست میکند
     */
    @Test
    void javaArrayClone() {
        Integer[] arrayFrom = {33, 3, 4, 5};
        Integer[] arrayTo = arrayFrom.clone();
        Assertions.assertTrue(Arrays.equals(arrayFrom, arrayTo));
    }
}
