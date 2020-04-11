package com.motaharinia.javacore.jexceptionhandling.cjavamultiplecatchblock;

import com.motaharinia.javacore.jexceptionhandling.ajavaexceptionsopenlink.ExceptionHandling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatchMultipleExceptionTest {
    //متغیر تست
    CatchMultipleException catchMultipleException;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        catchMultipleException = new CatchMultipleException();
    }

    /**
     * این متد MultipleCatch را در مدیریت Exception ها را تست میکند
     */
    @Test
    void catchMultipleExceptionTest() {
        Integer result = catchMultipleException.devideFromArray(new Integer[]{1, 2, 3});
        Assertions.assertEquals(2000, result);
    }
}
