package com.motaharinia.javacore.objectclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/static-keyword-in-java
public class StaticTest {


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        Static.count = 0;
    }


    /**
     * این متد قابلیتهای متد static را تست میکند
     */
    @Test
    void staticMethodTest() {
        Static.change();
        Assertions.assertEquals(1, Static.count);
    }

}
