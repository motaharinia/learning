package com.motaharinia.javacore.qjavareflection.fcallprivatemethod;

import com.motaharinia.javacore.qjavareflection.ecreatingappletviewer.CustomApplet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/how-to-call-private-method-from-another-class-in-java
 */
public class CallPrivateMethodTest {
    //متغیر تست
    CallPrivateMethod callPrivateMethod;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        callPrivateMethod = new CallPrivateMethod();
    }

    /**
     * این متد فراخوانی متد خصوصی با بازتاب در جاوا را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void callPrivateMethodTest() throws Exception {
        Assertions.assertEquals("hello java", callPrivateMethod.callPrivate(CallPrivateMethodSample.class));
    }
}
