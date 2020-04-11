package com.motaharinia.javacore.jexceptionhandling.ejavafinallyblock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/finally-block-in-exception-handling
 */
public class FinallyBlockTest {
    //متغیر تست
    FinallyBlock finallyBlock;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        finallyBlock = new FinallyBlock();
    }

    /**
     * این متد finallyBlockTest در مدیریت Exception ها را تست میکند
     */
    @Test
    void finallyBlockTest() {
        Integer result = finallyBlock.devide(5,0);
        Assertions.assertEquals(1, result);
    }
}
