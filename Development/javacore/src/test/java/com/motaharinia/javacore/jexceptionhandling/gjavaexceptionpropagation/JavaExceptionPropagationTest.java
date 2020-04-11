package com.motaharinia.javacore.jexceptionhandling.gjavaexceptionpropagation;

import com.motaharinia.javacore.jexceptionhandling.gjavaexceptionpropagation.JavaExceptionPropagation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/exception-propagation
 */
public class JavaExceptionPropagationTest {
    //متغیر تست
    JavaExceptionPropagation javaExceptionPropagation;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        javaExceptionPropagation = new JavaExceptionPropagation();
    }

    /**
     * این متد Unchecked Exception Propagation (برای مثال RuntimeException) در مدیریت Exception ها را تست میکند
     */
    @Test
    void javaExceptionPropagationUncheckedTest() {
        Integer result = javaExceptionPropagation.uncheckedRuntimeMethod1();
        Assertions.assertEquals(null, result);
    }

}
