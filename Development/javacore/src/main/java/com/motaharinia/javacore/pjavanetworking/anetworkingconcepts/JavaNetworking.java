package com.motaharinia.javacore.pjavanetworking.anetworkingconcepts;

/**
 * https://www.javatpoint.com/java-networking
 * Java Networking is a concept of connecting two or more computing devices together so that we can share resources.
 * Java socket programming provides facility to share data between different computing devices.
 * Advantage of Java Networking:
 * 1. sharing resources
 * 2. centralize software management
 * شبکه جاوا مفهومی برای اتصال دو یا چند دستگاه محاسباتی به یکدیگر است تا بتوانیم منابع را به اشتراک بگذاریم.
 * برنامه نویسی سوکت جاوا امکان به اشتراک گذاری داده ها بین دستگاه های مختلف محاسباتی را فراهم می کند.
 * مزیت شبکه جاوا:
 *1. به اشتراک گذاری منابع
 * 2. متمرکز کردن مدیریت نرم افزار
 *
 *Java Networking Terminology:
 * 1) IP Address
 * IP address is a unique number assigned to a node of a network e.g. 192.168.0.1 . It is composed of octets that range from 0 to 255.
 * It is a logical address that can be changed.
 * 2) Protocol
 * A protocol is a set of rules basically that is followed for communication. For example:
 * TCP
 * FTP
 * Telnet
 * SMTP
 * POP etc.
 * 3) Port Number
 * The port number is used to uniquely identify different applications. It acts as a communication endpoint between applications.
 * The port number is associated with the IP address for communication between two applications.
 * 4) MAC Address
 * MAC (Media Access Control) Address is a unique identifier of NIC (Network Interface Controller).
 * A network node can have multiple NIC but each with unique MAC.
 * 5) Connection-oriented and connection-less protocol
 * In connection-oriented protocol, acknowledgement is sent by the receiver.
 * So it is reliable but slow. The example of connection-oriented protocol is TCP.
 * But, in connection-less protocol, acknowledgement is not sent by the receiver. So it is not reliable but fast.
 * The example of connection-less protocol is UDP.
 * 6) Socket
 * A socket is an endpoint between two way communication.
 *اصطلاحات شبکه سازی جاوا:
 * 1) آدرس IP
 * آدرس IP شماره منحصر به فردی است که به عنوان مثال به یک گره شبکه اختصاص داده شده است. 192.168.0.1. از octets تشکیل شده است که از 0 تا 255 متغیر است.
 * این یک آدرس منطقی است که می تواند تغییر کند.
 * 2) پروتکل
 * پروتکل مجموعه ای از قوانین است که اساساً برای ارتباطات دنبال می شود. مثلا:
 * TCP
 * FTP
 * Telnet
 * SMTP
 * POP و غیره
 * 3) شماره پورت
 * شماره پورت برای شناسایی منحصر به فرد برنامه های مختلف استفاده می شود. این به عنوان یک نقطه پایانی ارتباط بین برنامه ها عمل می کند.
 * شماره پورت برای ارتباط بین دو برنامه با آدرس IP مرتبط است.
 * 4) آدرس MAC
 * آدرس MAC (Media Access Control) یک شناسه منحصر به فرد NIC (کنترل کننده رابط شبکه) است.
 * گره شبکه می تواند دارای چندین NIC باشد اما هرکدام دارای MAC بی نظیری هستند.
 * 5) پروتکل Connection-oriented و connection-less
 * در پروتکل Connection-oriented ، تأیید توسط گیرنده ارسال می شود.
 * بنابراین قابل اعتماد اما کند است. نمونه پروتکل connection-oriented را میتوان TCP گفت.
 * اما ، در پروتکل connection-less  ، تأیید توسط گیرنده ارسال نمی شود. بنابراین قابل اعتماد نیست اما سریع است.
 * نمونه پروتکل connection-less  را میتوان UDP گفت.
 * 6) سوکت
 * سوکت نقطه پایانی بین ارتباط دو طرفه است.
 *
 * java.net package
 * The java.net package provides many classes to deal with networking applications in Java. A list of these classes is given below:
 * Authenticator
 * CacheRequest
 * CacheResponse
 * ContentHandler
 * CookieHandler
 * CookieManager
 * DatagramPacket
 * DatagramSocket
 * DatagramSocketImpl
 * InterfaceAddress
 * JarURLConnection
 * MulticastSocket
 * InetSocketAddress
 * InetAddress
 * Inet4Address
 * Inet6Address
 * IDN
 * HttpURLConnection
 * HttpCookie
 * NetPermission
 * NetworkInterface
 * PasswordAuthentication
 * Proxy
 * ProxySelector
 * ResponseCache
 * SecureCacheResponse
 * ServerSocket
 * Socket
 * SocketAddress
 * SocketImpl
 * SocketPermission
 * StandardSocketOptions
 * URI
 * URL
 * URLClassLoader
 * URLConnection
 * URLDecoder
 * URLEncoder
 * URLStreamHandler
 */
public class JavaNetworking {
}
