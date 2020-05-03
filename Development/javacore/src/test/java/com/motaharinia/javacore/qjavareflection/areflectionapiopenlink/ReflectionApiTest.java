package com.motaharinia.javacore.qjavareflection.areflectionapiopenlink;

import com.motaharinia.javacore.qjavareflection.bnewinstancemethod.NewInstanceMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/java-reflection
 */
public class ReflectionApiTest {
    //متغیر تست
    ReflectionApi reflectionApi;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        reflectionApi = new ReflectionApi();
    }

    /**
     * این متد ReflectionApi جاوا را در حالت Class.forName تست میکند
     *
     * @throws IOException
     */
    @Test
    public void reflectionApiByForNameTest() throws Exception {
        Assertions.assertEquals(Simple.class, reflectionApi.getClassByForName("com.motaharinia.javacore.qjavareflection.areflectionapiopenlink.Simple"));
    }


    /**
     * این متد ReflectionApi جاوا را در حالت Object.getClass تست میکند
     *
     * @throws IOException
     */
    @Test
    public void reflectionApiByObjectTest() throws Exception {
        Assertions.assertEquals(Simple.class, reflectionApi.getClassByObject());
    }

    /**
     * این متد ReflectionApi جاوا را در حالت Primitive تست میکند
     *
     * @throws IOException
     */
    @Test
    public void reflectionApiByPrimitiveTest() throws Exception {
        Assertions.assertEquals(boolean.class, reflectionApi.getClassByPrimitive());
    }
}
