package com.motaharinia.javacore.pjavanetworking.gdatagramsocketclass;


/**
 * https://www.javatpoint.com/DatagramSocket-and-DatagramPacket
 * Java DatagramSocket and DatagramPacket:
 * Java DatagramSocket and DatagramPacket classes are used for connection-less socket programming
 * کلاسهای DatagramSocket و  DatagramPacket :
 * کلاس های Java DatagramSocket و DatagramPacket برای برنامه نویسی سوکت connection-less  استفاده می شوند
 *
 * Java DatagramSocket class:
 * Java DatagramSocket class represents a connection-less socket for sending and receiving datagram packets.
 * A datagram is basically an information but there is no guarantee of its content, arrival or arrival time.
 * Commonly used Constructors of DatagramSocket class:
 * DatagramSocket() throws SocketException:
 * it creates a datagram socket and binds it with the available Port Number on the localhost machine.
 * DatagramSocket(int port) throws SocketException:
 * it creates a datagram socket and binds it with the given Port Number.
 * DatagramSocket(int port, InetAddress address) throws SocketEeption:
 * it creates a datagram socket and binds it with the specified port number and host address.
 * کلاس Java DatagramSocket:
 * کلاس Java DatagramSocket یک سوکت connection-less برای ارسال و دریافت بسته های دیتاگرام را نشان می دهد.
 * دیتاگرام اساساً یک اطلاعات است اما هیچ تضمینی از محتوای آن ، زمان ورود یا ورود آن وجود ندارد.
 * سازندگان متداول کلاس DatagramSocket:
 * DatagramSocket() throws SocketException:
 * این یک سوکت datagram ایجاد می کند و آن را با شماره پورت موجود در دستگاه localhost متصل می کند.
 * DatagramSocket(int port) throws SocketException:
 * یک سوکت datagram ایجاد می کند و آن را با شماره پورت داده شده متصل می کند.
 * DatagramSocket(int port, InetAddress address) throws SocketException:
 * یک سوکت datagram ایجاد می کند و آن را با شماره پورت مشخص شده و آدرس میزبان متصل می کند.
 *
 * Java DatagramPacket class:
 * Java DatagramPacket is a message that can be sent or received.
 * If you send multiple packet, it may arrive in any order.
 * Additionally, packet delivery is not guaranteed.
 * Commonly used Constructors of DatagramPacket class:
 * DatagramPacket(byte[] barr, int length):
 * it creates a datagram packet. This constructor is used to receive the packets.
 * DatagramPacket(byte[] barr, int length, InetAddress address, int port):
 * it creates a datagram packet. This constructor is used to send the packets.
 * کلاس Java DatagramPacket:
 * یک DatagramPacket جاوا پیامی است که می تواند ارسال یا دریافت شود.
 * اگر چندین بسته ارسال کنید ، ممکن است به هر ترتیبی برسد.
 * علاوه بر این ، تحویل بسته تضمین نمی شود.
 * سازندگان متداول کلاس DatagramPacket:
 * DatagramPacket(byte[] barr, int length):
 * یک بسته داده ایجاد می کند. از این سازنده برای دریافت بسته ها استفاده می شود.
 * DatagramPacket(byte[] barr, int length, InetAddress address, int port):
 * یک بسته داده ایجاد می کند. از این سازنده برای ارسال بسته ها استفاده می شود.
 */
public class DatagramSocketDatagramPacket {

}
