package com.motaharinia.javacore.jexceptionhandling.djavanestedtry;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/nested-try-block
 */
public class NestedTryBlockTest {
    //متغیر تست
    NestedTryBlock nestedTryBlock;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        nestedTryBlock = new NestedTryBlock();
    }

    /**
     * این متد NestedTryBlock در مدیریت Exception ها را تست میکند
     */
    @Test
    void nestedTryBlockTest() {
        Integer result = nestedTryBlock.devidFromArray();
        Assertions.assertEquals(1, result);
    }
}
