package com.motaharinia.javacore.pjavanetworking.gdatagramsocketclass;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public String sendMessage(String host, Integer port, String greeting) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getByName(host);
        DatagramPacket datagramPacket = new DatagramPacket(greeting.getBytes(), greeting.length(), inetAddress, port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
        return "ok";
    }
}
