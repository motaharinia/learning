package com.motaharinia.javacore.pjavanetworking.bsocketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GreetClient {
    private Socket clientSocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    /**
     * Creating Client:
     * To create the client application, we need to create the instance of Socket class.
     * Here, we need to pass the IP address or hostname of the Server and a port number.
     * Here, we are using "localhost" because our server is running on same system.
     * ایجاد مشتری:
     * برای ایجاد برنامه مشتری ، باید نمونه کلاس Socket را ایجاد کنیم.
     * در اینجا ، باید آدرس IP یا نام میزبان سرور و شماره پورت را منتقل کنیم.
     * در اینجا ، ما از "localhost" استفاده می کنیم زیرا سرور ما در همان سیستم کار می کند.
     *
     * @throws IOException
     */
    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
        bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException {
        printWriter.println(msg);
        String resp = bufferedReader.readLine();
        return resp;
    }

    public void stopConnection() throws IOException {
        bufferedReader.close();
        printWriter.close();
        clientSocket.close();
    }
}
