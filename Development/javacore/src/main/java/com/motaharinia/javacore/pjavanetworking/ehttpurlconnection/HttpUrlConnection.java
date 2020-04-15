package com.motaharinia.javacore.pjavanetworking.ehttpurlconnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * https://www.javatpoint.com/java-http-url-connection
 * Java HttpURLConnection class
 * The Java HttpURLConnection class is http specific URLConnection. It works for HTTP protocol only.
 * By the help of HttpURLConnection class, you can information of any HTTP URL such as header information, status code, response code etc.
 * The java.net.HttpURLConnection is subclass of URLConnection class.
 * کلاس HttpURLConnection جاوا
 * کلاس  HttpURLConnection جاوا یک اتصال اینترنتی خاص URL است. این فقط برای پروتکل HTTP کار می کند.
 * با کمک کلاس HttpURLConnection ، می توانید اطلاعات مربوط به هر آدرس اینترنتی HTTP مانند اطلاعات هدر ، کد وضعیت ، کد پاسخ و غیره را کسب کنید.
 * کلاس java.net.HttpURLConnection زیر کلاس URLConnection است.
 *
 * How to get the object of HttpURLConnection class
 * The openConnection() method of URL class returns the object of URLConnection class. Syntax:
 * public URLConnection openConnection()throws IOException{}
 * You can typecast it to HttpURLConnection type as given below.
 * URL url=new URL("http://www.javatpoint.com/java-tutorial");
 * HttpURLConnection huc=(HttpURLConnection)url.openConnection();
 * نحوه دریافت شی کلاس HttpURLConnection
 * متد openConnection کلاس URL شیء کلاس URLConnection را برمی گرداند. نحو:
 * public URLConnection openConnection()throws IOException{}
 * می توانید مطابق شکل زیر آن را به نوع HttpURLConnection تبدیل کنید.
 * URL url=new URL("http://www.javatpoint.com/java-tutorial");
 * HttpURLConnection huc=(HttpURLConnection)url.openConnection();
 */
public class HttpUrlConnection {

    /**
     * محتویات نام هدر درخواستی در آدرس Url صفحه وب مورد نظر را خروجی میدهد
     *
     * @param urlPath آدرس Url صفحه وب مورد نظر
     * @param headerName نام هدر درخواستی
     * @return خروجی: محتویات هدردرخواستی
     */
    public String getUrlHeader(String urlPath,String headerName) throws IOException {
        URL url = new URL(urlPath);
        HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
        return httpURLConnection.getHeaderField(headerName);
    }
}
