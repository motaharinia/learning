package com.motaharinia.msutility;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;


import static java.lang.System.out;

/**
 * Created by IntelliJ IDEA.
 * User: https://github.com/motaharinia
 * Date: 2020-06-15
 * Time: 17:13:07
 * Description:
 */
public class CharsetDemo {

    public static String getEncoding()
    {
        final byte [] bytes = {'D'};
        final InputStream inputStream = new ByteArrayInputStream(bytes);
        final InputStreamReader reader = new InputStreamReader(inputStream);
        final String encoding = reader.getEncoding();
        return encoding;
    }
    public static void main(final String[] arguments)
    {
        out.println("Default Locale:   " + Locale.getDefault());
        out.println("Default Charset:  " + Charset.defaultCharset());
        out.println("file.encoding;    " + System.getProperty("file.encoding"));
        out.println("sun.jnu.encoding: " + System.getProperty("sun.jnu.encoding"));
        out.println("Default Encoding: " + getEncoding());
    }
}
