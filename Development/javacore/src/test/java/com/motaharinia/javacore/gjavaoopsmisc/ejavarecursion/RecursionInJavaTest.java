package com.motaharinia.javacore.gjavaoopsmisc.ejavarecursion;

import com.motaharinia.javacore.gjavaoopsmisc.bobjectcloning.ObjectCloningInJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unitils.reflectionassert.ReflectionAssert;

//https://www.javatpoint.com/recursion-in-java
public class RecursionInJavaTest {

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {

    }

    /**
     * این متد پیاده سازی فاکتوریل را با تابع بازگشتی تست میکند
     */
    @Test
    void recursionInJavaFactorialTest() {
        ReflectionAssert.assertReflectionEquals(120, RecursionInJava.factorial(5));
    }
}
