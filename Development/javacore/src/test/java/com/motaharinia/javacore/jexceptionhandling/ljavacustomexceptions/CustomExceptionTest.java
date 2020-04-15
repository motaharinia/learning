package com.motaharinia.javacore.jexceptionhandling.ljavacustomexceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/custom-exception
 */
public class CustomExceptionTest {
    //متغیر تست
    CustomException customException;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        customException = new CustomException("");
    }

    /**
     * این متد CustomException را تست میکند
     */
    @Test
    void customExceptionTest() {
        Assertions.assertThrows(CustomException.class,() -> customException.validate(-1),"not valid");
    }
}
