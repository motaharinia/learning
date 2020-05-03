package com.motaharinia.javacore.pjavanetworking.bsocketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    /**
     * Creating Server:
     * To create the server application, we need to create the instance of ServerSocket class.
     * Here, we are using 6666 port number for the communication between the client and server.
     * You may also choose any other port number. The accept() method waits for the client.
     * If clients connects with the given port number, it returns an instance of Socket.
     * ایجاد سرور:
     * برای ایجاد برنامه سرور ، باید نمونه کلاس ServerSocket را ایجاد کنیم.
     * در اینجا ، ما از شماره پورت 6666 برای ارتباط بین مشتری و سرور استفاده می کنیم.
     * همچنین ممکن است هر شماره درگاه دیگری را انتخاب کنید. روش قبول () منتظر مشتری است.
     * اگر مشتری با شماره پورت داده شده ارتباط برقرار کند ، نمونه ای از Socket را برمی گرداند.
     *
     * @throws IOException
     */
    public void start(Integer port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
        bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = bufferedReader.readLine();
        if ("hello server".equals(greeting)) {
            printWriter.println("hello client");
        } else {
            printWriter.println("unrecognised greeting");
        }
    }

    public void stop() throws IOException {
        bufferedReader.close();
        printWriter.close();
        clientSocket.close();
        serverSocket.close();
    }
//    public static void main(String[] args) throws IOException {
//        GreetServer server=new GreetServer();
//        server.start(6666);
//    }
}
