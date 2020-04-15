package com.motaharinia.javacore.pjavanetworking.bsocketprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SocketProgrammingTest {

    //متغیر تست
    Thread thread;
    GreetClient client;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws IOException {
        thread = new Thread() {
            public void run() {
                try {
                    new GreetServer().start(6666);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        client = new GreetClient();
        client.startConnection("127.0.0.1", 6666);
    }


    /**
     * این متد سوکت جاوا را تست میکند
     * @throws IOException
     */
    @Test
    public void socketProgrammingTest() throws IOException {
        String response = client.sendMessage("hello server");
        Assertions.assertEquals("hello client", response);
    }
}
