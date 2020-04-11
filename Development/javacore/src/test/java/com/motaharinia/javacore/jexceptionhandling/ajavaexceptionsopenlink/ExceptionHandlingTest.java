package com.motaharinia.javacore.jexceptionhandling.ajavaexceptionsopenlink;

import com.motaharinia.javacore.gjavaoopsmisc.fcallbyvalue.CallByValueReference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/exception-handling-in-java
 */
public class ExceptionHandlingTest {
    //متغیر تست
    ExceptionHandling exceptionHandling;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        exceptionHandling = new ExceptionHandling();
    }

    /**
     * این متد بلوک catch را در مدیریت Exception ها را تست میکند
     */
    @Test
    void exceptionHandlingCatchTest() {
        Integer result = exceptionHandling.devide(5, 0);
        Assertions.assertEquals(null, result);
    }
}
