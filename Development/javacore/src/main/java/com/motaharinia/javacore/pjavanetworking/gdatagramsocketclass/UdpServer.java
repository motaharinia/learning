package com.motaharinia.javacore.pjavanetworking.gdatagramsocketclass;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {

    DatagramSocket datagramSocket;

    public void start(Integer port) throws IOException {
        this.datagramSocket = new DatagramSocket(port);
        byte[] bufferArray = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bufferArray, 1024);
        this.datagramSocket.receive(datagramPacket);
        String greeting = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        if ("hello server".equals(greeting)) {
            greeting = "hello client";
        } else {
            greeting = "unrecognised greeting";
        }
        System.out.println(greeting);
        this.stop();
    }

    public void stop() throws IOException {
        this.datagramSocket.close();
    }
}
