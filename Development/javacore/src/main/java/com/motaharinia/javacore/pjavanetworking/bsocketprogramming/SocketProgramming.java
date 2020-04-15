package com.motaharinia.javacore.pjavanetworking.bsocketprogramming;


/**
 * https://www.javatpoint.com/socket-programming
 * Java Socket Programming:
 * Java Socket programming is used for communication between the applications running on different JRE.
 * Java Socket programming can be connection-oriented or connection-less.
 * Socket and ServerSocket classes are used for connection-oriented socket programming and DatagramSocket and DatagramPacket classes are used for connection-less socket programming.
 * The client in socket programming must know two information:
 * 1. IP Address of Server, and
 * 2. Port number.
 * Here, we are going to make one-way client and server communication.
 * In this application, client sends a message to the server, server reads the message and prints it.
 * Here, two classes are being used: Socket and ServerSocket.
 * The Socket class is used to communicate client and server.
 * Through this class, we can read and write message. The ServerSocket class is used at server-side.
 * The accept() method of ServerSocket class blocks the console until the client is connected.
 * After the successful connection of client, it returns the instance of Socket at server-side.
 * برنامه نویسی جاوا سوکت:
 * برنامه نویسی Java Socket برای ارتباط بین برنامه های در حال اجرا در JRE مختلف استفاده می شود.
 * برنامه نویسی Java Socket می تواند connection-oriented یا connection-less باشد.
 * کلاس های Socket و ServerSocket برای برنامه نویسی سوکت اتصال-گرا استفاده می شود و کلاس های DatagramSocket و DatagramPacket برای برنامه نویسی سوکت connection-less استفاده می شوند.
 * مشتری در برنامه نویسی سوکت باید دو اطلاعات را بداند:
 * 1. آدرس IP سرور ، و
 * 2. شماره پورت.
 * در اینجا ، ما قصد داریم ارتباطات یک طرفه مشتری و سرور برقرار کنیم.
 * در این برنامه ، مشتری یک پیام به سرور ارسال می کند ، سرور پیام را می خواند و آن را چاپ می کند.
 * در اینجا دو کلاس استفاده می شود: Socket و ServerSocket.
 * کلاس Socket برای ارتباط مشتری و سرور استفاده می شود.
 * از طریق این کلاس می توانیم پیام بخوانیم و بنویسیم. کلاس ServerSocket در سمت سرور استفاده می شود.
 * متد accept کلاس ServerSocket تا زمانی که مشتری متصل نشود ، کنسول را مسدود می کند.
 * پس از اتصال موفق مشتری ، نمونه Socket را در سمت سرور برمی گرداند.
 * <p>
 * Socket class:
 * A socket is simply an endpoint for communications between the machines.
 * The Socket class can be used to create a socket.
 * Important methods:
 * 1) public InputStream getInputStream():
 * returns the InputStream attached with this socket.
 * 2) public OutputStream getOutputStream():
 * returns the OutputStream attached with this socket.
 * 3) public synchronized void close():
 * closes this socket
 * کلاس Socket:
 * یک سوکت به سادگی یک نقطه پایانی برای برقراری ارتباط بین دستگاه ها است.
 * از کلاس Socket می توان برای ایجاد سوکت استفاده کرد.
 * متدهای مهم:
 * 1) public InputStream getInputStream():
 * این متدInputStream متصل به این سوکت را باز می گرداند.
 * 2) public OutputStream getOutputStream():
 * این متدOutputStream متصل به این سوکت را برمی گرداند.
 * 3) public synchronized void close():
 * این متد سوکت را می بندد
 * <p>
 * ServerSocket class:
 * The ServerSocket class can be used to create a server socket.
 * This object is used to establish communication with the clients.
 * 1) public Socket accept():
 * returns the socket and establish a connection between server and client.
 * 2) public synchronized void close():
 * closes the server socket.
 * کلاس ServerSocket:
 * از کلاس ServerSocket می توان برای ایجاد سوکت سرور استفاده کرد.
 * از این شیء برای برقراری ارتباط با مشتری استفاده می شود.
 * 1) public Socket accept():
 * سوکت را برمی گرداند و بین سرور و مشتری ارتباط برقرار می کند.
 * 2) public synchronized void close():
 * سوکت سرور را می بندد.
 */
public class SocketProgramming {

}
