package com.motaharinia.javacore.pjavanetworking.ehttpurlconnection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/java-http-url-connection
 */
public class HttpUrlConnectionTest {
    //متغیر تست
    HttpUrlConnection httpUrlConnection;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws IOException {
        httpUrlConnection = new HttpUrlConnection();
    }

    /**
     * این متد httpUrlConnection جاوا را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void httpUrlConnectionTest() throws IOException {
        String resultHeaderValue = httpUrlConnection.getUrlHeader("http://www.google.com", "content-type");
        Assertions.assertEquals("text/html; charset=ISO-8859-1", resultHeaderValue);
    }
}
