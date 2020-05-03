package com.motaharinia.javacore.qjavareflection.bnewinstancemethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/new-instance()-method
 */
public class NewInstanceMethodTest {
    //متغیر تست
    NewInstanceMethod newInstanceMethod;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        newInstanceMethod = new NewInstanceMethod();
    }

    /**
     * این متد newInstance جاوا را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void newInstanceMethodTest() throws Exception {
        Assertions.assertEquals("Hello Java", newInstanceMethod.method1());
    }
}
