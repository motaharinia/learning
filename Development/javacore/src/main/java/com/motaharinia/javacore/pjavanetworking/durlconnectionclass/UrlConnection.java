package com.motaharinia.javacore.pjavanetworking.durlconnectionclass;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * https://www.javatpoint.com/URLConnection-class
 * Java URLConnection class
 * The Java URLConnection class represents a communication link between the URL and the application.
 * This class can be used to read and write data to the specified resource referred by the URL.
 * کلاس URLConnection Java
 * کلاس URLConnection جاوا یک ارتباط بین URL و برنامه را نشان می دهد.
 * از این کلاس می توان برای خواندن و نوشتن داده ها به منبع مشخص شده توسط URL استفاده کرد.
 * <p>
 * How to get the object of URLConnection class:
 * The openConnection() method of URL class returns the object of URLConnection class. Syntax:
 * public URLConnection openConnection()throws IOException{}
 * نحوه به دست آوردن شیی از کلاس URLConnection:
 * متد openConnection کلاس URL شیء کلاس URLConnection را برمی گرداند. نحو:
 * public URLConnection openConnection()throws IOException{}
 * <p>
 * Displaying source code of a webpage by URLConnecton class:
 * The URLConnection class provides many methods,
 * we can display all the data of a webpage by using the getInputStream() method.
 * The getInputStream() method returns all the data of the specified URL in the stream that can be read and displayed.
 * نمایش کد منبع یک صفحه وب توسط کلاس URLConnecton:
 * کلاس URLConnection متد های بسیاری را ارائه می دهد ،
 * می توانیم با استفاده از متد getInputStream  تمام داده های یک صفحه وب را نمایش دهیم.
 * متد getInputStream تمام داده های URL مشخص شده را در جریانی که قابل خواندن و نمایش است برمی گرداند.
 */
public class UrlConnection {
    /**
     * محتویات سورس آدرس Url صفحه وب مورد نظر را خروجی میدهد
     *
     * @param urlPath آدرس Url صفحه وب مورد نظر
     * @return خروجی: سورس صفحه وب
     */
    public String getUrlSource(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        byte[] resultByteArray = new byte[inputStream.available()];
        inputStream.read(resultByteArray);
        String resultSourceCode = new String(resultByteArray, StandardCharsets.UTF_8);
        return resultSourceCode;
    }
}
