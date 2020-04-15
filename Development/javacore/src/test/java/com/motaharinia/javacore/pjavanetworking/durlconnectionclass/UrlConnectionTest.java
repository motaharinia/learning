package com.motaharinia.javacore.pjavanetworking.durlconnectionclass;

import com.motaharinia.javacore.pjavanetworking.bsocketprogramming.GreetClient;
import com.motaharinia.javacore.pjavanetworking.bsocketprogramming.GreetServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/URLConnection-class
 */
public class UrlConnectionTest {
    //متغیر تست
    UrlConnection urlConnection;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws IOException {
        urlConnection = new UrlConnection();
    }

    /**
     * این متد urlConnection جاوا را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void urlConnectionTest() throws IOException {
        String resultSourceCode = urlConnection.getUrlSource("http://www.google.com");
        System.out.println(resultSourceCode);
        Assertions.assertEquals(true, resultSourceCode.contains("<html "));
    }
}
