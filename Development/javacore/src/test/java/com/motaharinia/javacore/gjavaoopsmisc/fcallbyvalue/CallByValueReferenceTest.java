package com.motaharinia.javacore.gjavaoopsmisc.fcallbyvalue;

import com.motaharinia.javacore.gjavaoopsmisc.bobjectcloning.ObjectCloningInJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unitils.reflectionassert.ReflectionAssert;

//https://www.javatpoint.com/call-by-value-and-call-by-reference-in-java
public class CallByValueReferenceTest {
    //متغیر تست
    CallByValueReference callByValueReference;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        callByValueReference = new CallByValueReference();
    }

    /**
     * این متد پیاده سازی قابلیت callByValue را در فراخوانی متد تست میکند
     */
    @Test
    void callByValueTest() throws CloneNotSupportedException {
        int test=100;
        callByValueReference.callByValue(test);
        ReflectionAssert.assertReflectionEquals(100, test);
    }

    /**
     * این متد پیاده سازی قابلیت callByReference را در فراخوانی متد تست میکند
     */
    @Test
    void callByReferenceTest() throws CloneNotSupportedException {
        CallByValueReference  callByValueReference2 = new CallByValueReference();
        callByValueReference.callByReference(callByValueReference2);
        ReflectionAssert.assertReflectionEquals(150, callByValueReference2.data);
    }
}
