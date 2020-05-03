package com.motaharinia.javacore.pjavanetworking.finetaddressclass;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * https://www.javatpoint.com/InetAddress-class
 * Java InetAddress class represents an IP address.
 * The java.net.InetAddress class provides methods to get the IP of any host name for example www.javatpoint.com, www.google.com, www.facebook.com, etc.
 * An IP address is represented by 32-bit or 128-bit unsigned number.
 * An instance of InetAddress represents the IP address with its corresponding host name.
 * There are two types of address types: Unicast and Multicast.
 * The Unicast is an identifier for a single interface whereas Multicast is an identifier for a set of interfaces.
 * Moreover, InetAddress has a cache mechanism to store successful and unsuccessful host name resolutions.
 * کلاس Java InetAddress یک آدرس IP را نشان می دهد.
 * کلاس java.net.InetAddress متد هایی را برای دریافت IP هر نام میزبان به عنوان مثال www.javatpoint.com ، www.google.com ، www.facebook.com و غیره ارائه می دهد.
 * آدرس IP با شماره 32 بیتی یا 128 بیتی unsigned نمایش داده می شود.
 * نمونه ای از InetAddress آدرس IP را با نام میزبان مربوطه نشان می دهد.
 * دو نوع از نوع آدرس وجود دارد: Unicast و Multicast.
 * یک Unicast یک شناسه برای یک رابط واحد است در حالی که Multicast یک شناسه برای مجموعه ای از رابط ها است.
 * علاوه بر این ، InetAddress یک مکانیزم حافظه نهان برای ذخیره نتیجه های موفق و ناموفق نام هاست دارد.
 * <p>
 * Commonly used methods of InetAddress class
 * public static InetAddress getByName(String host) throws UnknownHostException
 * it returns the instance of InetAddress containing LocalHost IP and name.
 * public static InetAddress getLocalHost() throws UnknownHostException
 * it returns the instance of InetAdddress containing local host name and address.
 * public String getHostName()
 * it returns the host name of the IP address.
 * public String getHostAddress()
 * it returns the IP address in string format.
 * متدهای متداول از کلاس InetAddress
 * public static InetAddress getByName(String host) throws UnknownHostException
 * نمونه InetAddress حاوی IP و نام LocalHost را برمی گرداند
 * public static InetAddress getLocalHost() throws UnknownHostException
 * نمونه InetAddress را که حاوی نام و آدرس میزبان محلی است ، برمی گرداند.
 * public String getHostName()
 * نام میزبان آدرس IP را برمی گرداند.
 * public String getHostAddress()
 * آدرس IP را با فرمت رشته ای برمی گرداند.
 */
public class JavaInetAddress {
    public String getIp(String host) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getByName(host);
        return inetAddress.getHostAddress();
    }
}
