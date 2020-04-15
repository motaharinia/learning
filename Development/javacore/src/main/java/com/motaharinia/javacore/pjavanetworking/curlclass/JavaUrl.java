package com.motaharinia.javacore.pjavanetworking.curlclass;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * https://www.javatpoint.com/URL-class
 * The Java URL class represents an URL. URL is an acronym for Uniform Resource Locator.
 * It points to a resource on the World Wide Web.
 * کلاس URL جاوا URL را نشان می دهد. URL مخفف Uniform Resource Locator است.
 * این به یک منبع در شبکه جهانی وب اشاره می کند.
 * <p>
 * A URL contains many information:
 * Protocol:
 * In this case, http is the protocol.
 * Server name or IP Address:
 * In this case, www.javatpoint.com is the server name.
 * Port Number:
 * It is an optional attribute. If we write http//www.javatpoint.com:80/sonoojaiswal/ , 80 is the port number. If port number is not mentioned in the URL, it returns -1.
 * File Name or directory name:
 * In this case, index.jsp is the file name.
 * یک URL حاوی اطلاعات زیادی است:
 * پروتکل:
 * در این حالت ، http پروتکل است.
 * نام سرور یا آدرس IP:
 * در این حالت ، www.javatpoint.com نام سرور است.
 * شماره پورت:
 * این یک خصیصه اختیاری است. اگر http//ww.javatpoint.com:80/sonoojaiswal/ را بنویسیم: 80 شماره پورت است. اگر شماره پورت در URL ذکر نشده باشد ، -1 را برمی گرداند.
 * نام فایل یا نام پوشه:
 * در این حالت index.jsp نام فایل است.
 * <p>
 * Constructors of Java URL class
 * سازندگان کلاس URL جاوا
 * URL(String spec):
 * نمونه ای از URL را از نمایه String ایجاد می کند.
 * URL(String protocol, String host, int port, String file):
 * نمونه ای از URL را از پروتکل داده شده ، میزبان ، شماره پورت و پرونده ایجاد می کند.
 * URL(String protocol, String host, int port, String file, URLStreamHandler handler):
 * نمونه ای از URL را از پروتکل داده شده ، میزبان ، شماره پورت ، پرونده و کنترل کننده ایجاد می کند.
 * URL(String protocol, String host, String file):
 * نمونه ای از URL را از نام پروتکل داده شده ، نام میزبان و نام پرونده ایجاد می کند
 * URL(URL context, String spec):
 * با تجزیه نمونه مشخص در یک زمینه مشخص ، نمونه ای از URL را ایجاد می کند
 * URL(URL context, String spec, URLStreamHandler handler):
 * نمونه ای از URL را با تجزیه کردن مشخصات داده شده با کنترل کننده مشخص شده در یک متن مشخص ، ایجاد می کند.
 * <p>
 * Commonly used methods of Java URL class
 * The java.net.URL class provides many methods. The important methods of URL class are given below.
 * public String getProtocol()	it returns the protocol of the URL.
 * public String getHost()	it returns the host name of the URL.
 * public String getPort()	it returns the Port Number of the URL.
 * public String getFile()	it returns the file name of the URL.
 * public String getAuthority()	it returns the authority of the URL.
 * public String toString()	it returns the string representation of the URL.
 * public String getQuery()	it returns the query string of the URL.
 * public String getDefaultPort()	it returns the default port of the URL.
 * public URLConnection openConnection()	it returns the instance of URLConnection i.e. associated with this URL.
 * public boolean equals(Object obj)	it compares the URL with the given object.
 * public Object getContent()	it returns the content of the URL.
 * public String getRef()	it returns the anchor or reference of the URL.
 * public URI toURI()	it returns a URI of the URL.
 */
public class JavaUrl {
    void method1() throws MalformedURLException {
        URL url=new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host Name: "+url.getHost());
        System.out.println("Port Number: "+url.getPort());
        System.out.println("Default Port Number: "+url.getDefaultPort());
        System.out.println("Query String: "+url.getQuery());
        System.out.println("Path: "+url.getPath());
        System.out.println("File: "+url.getFile());

//        Protocol: https
//        Host Name: www.google.com
//        Port Number: -1
//        Default Port Number: 443
//        Query String: q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8
//        Path: /search
//        File: /search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8
    }
}
