package com.motaharinia.javacore.pjavanetworking.gdatagramsocketclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * https://www.javatpoint.com/DatagramSocket-and-DatagramPacket
 */
public class DatagramSocketDatagramPacketTest {
    //متغیر تست
    UdpServer udpServer;
    UdpClient udpClient;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() throws IOException {
        udpServer = new UdpServer();
        Thread thread = new Thread() {
            public void run() {
                try {
                    udpServer.start(3000);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        udpClient = new UdpClient();
    }

    /**
     * این متد datagramSocket و DatagramPacket در جاوا را برای ارسال پیام در حالت UDP را تست میکند
     *
     * @throws IOException
     */
    @Test
    public void datagramSocketDatagramPacketTest() throws Exception {
        String result = udpClient.sendMessage("localhost", 3000, "hello server");
        Assertions.assertEquals("ok", result);
    }
}
