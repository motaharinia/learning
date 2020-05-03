package com.motaharinia.javacore.pjavanetworking.finetaddressclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/InetAddress-class
 */
public class JavaInetAddressTest {
    //متغیر تست
    JavaInetAddress javaInetAddress;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws IOException {
        javaInetAddress = new JavaInetAddress();
    }

    /**
     * این متد InetAddress جاوا را برای به دست آوردن آدرس آی پی Host تست میکند
     *
     * @throws IOException
     */
    @Test
    public void javaInetAddressTest() throws Exception {
        Assertions.assertEquals("127.0.0.1", javaInetAddress.getIp("localhost"));
    }
}
