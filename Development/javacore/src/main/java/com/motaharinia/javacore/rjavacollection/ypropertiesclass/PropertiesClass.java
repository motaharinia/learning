package com.motaharinia.javacore.rjavacollection.ypropertiesclass;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * https://www.javatpoint.com/properties-class-in-java
 * The properties object contains key and value pair both as a string.
 * The java.util.Properties class is the subclass of Hashtable.
 * It can be used to get property value based on the property key.
 * The Properties class provides methods to get data from the properties file and store data into the properties file.
 * Moreover, it can be used to get the properties of a system.
 * شیء خصوصیات شامل جفت کلید و مقدار است که هر دو به عنوان یک رشته هستند.
 * کلاس java.util.Properties زیر مجموعه Hashtable است.
 * می توان از آن برای بدست آوردن ارزش بر اساس کلید ویژگی استفاده کرد.
 * کلاس Properties متد هایی را برای دریافت داده ها از پرونده Properties و ذخیره داده ها در پرونده Properties فراهم می کند.
 * علاوه بر این ، می توان برای به دست آوردن خواص یک سیستم استفاده کرد.
 * <p>
 * An Advantage of the properties file:
 * Recompilation is not required if the information is changed from a properties file:
 * If any information is changed from the properties file, you don't need to recompile the java class.
 * It is used to store information which is to be changed frequently.
 * مزیت properties file:
 * در صورت تغییر اطلاعات از یک properties file ، نیازی به Recompilation نیست:
 * اگر اطلاعاتی از properties file تغییر یافت ، نیازی به recompile کلاس java نیست.
 * از آن برای ذخیره اطلاعاتی استفاده می شود که بطور مکرر تغییر می یابد.
 * <p>
 * Constructors of Properties class:
 * Properties():
 * It creates an empty property list with no default values.
 * Properties(Properties defaults):
 * It creates an empty property list with the specified defaults.
 * سازندگان کلاس Properties:
 * Properties():
 * این یک لیست property خالی و بدون مقادیر پیش فرض ایجاد می کند.
 * Properties(Properties defaults):
 * این یک لیست property خالی را با پیش فرض های مشخص شده ایجاد می کند.
 * <p>
 * Methods of Properties class:
 * public void load(Reader r):
 * It loads data from the Reader object.
 * public void load(InputStream is):
 * It loads data from the InputStream object
 * public void loadFromXML(InputStream in):
 * It is used to load all of the properties represented by the XML document on the specified input stream into this properties table.
 * public String getProperty(String key):
 * It returns value based on the key.
 * public String getProperty(String key, String defaultValue):
 * It searches for the property with the specified key.
 * public void setProperty(String key, String value):
 * It calls the put method of Hashtable.
 * public void list(PrintStream out):
 * It is used to print the property list out to the specified output stream.
 * public void list(PrintWriter out)):
 * It is used to print the property list out to the specified output stream.
 * public Enumeration<?> propertyNames()):
 * It returns an enumeration of all the keys from the property list.
 * public Set<String> stringPropertyNames():
 * It returns a set of keys in from property list where the key and its corresponding value are strings.
 * public void store(Writer w, String comment):
 * It writes the properties in the writer object.
 * public void store(OutputStream os, String comment):
 * It writes the properties in the OutputStream object.
 * public void storeToXML(OutputStream os, String comment):
 * It writes the properties in the writer object for generating XML document.
 * public void storeToXML(Writer w, String comment, String encoding):
 * It writes the properties in the writer object for generating XML document with the specified encoding.
 * متد های کلاس Properties:
 * public void load(Reader r):
 * بارگیری داده از شی Reader است.
 * public void load(InputStream is):
 * بارگیری داده از شی InputStream است
 * public void loadFromXML(InputStream in):
 * برای بارگیری کلیه خصوصیاتی که توسط سند XML در جریان ورودی مشخص شده در این جدول خصوصیات وجود دارد ، استفاده می شود.
 * public String getProperty(String key):
 * مقدار را بر اساس کلید برمی گرداند.
 * public String getProperty(String key, String defaultValue):
 * با کلید مشخص شده ، ملک را جستجو می کند.
 * public void setProperty(String key, String value):
 * آن را متد قرار داده Hashtable می نامد.
 * public void list(PrintStream out):
 * از آن برای چاپ لیست ویژگی ها در جریان خروجی مشخص استفاده می شود.
 * public void list(PrintWriter out)):
 * از آن برای چاپ لیست ویژگی ها در جریان خروجی مشخص استفاده می شود.
 * public Enumeration<?> propertyNames()):
 * این شمارش همه کلیدها را از لیست ویژگیها برمی گرداند.
 * public Set<String> stringPropertyNames():
 * این مجموعه ای از کلیدها را از لیست ویژگیهایی که کلید و مقدار مربوط به آن رشته ها هستند ، برمی گرداند.
 * public void store(Writer w, String comment):
 * این خصوصیات را در موضوع نویسنده می نویسد.
 * public void store(OutputStream os, String comment):
 * این خصوصیات را در شیء OutputStream می نویسد.
 * public void storeToXML(OutputStream os, String comment):
 * این خصوصیات را در شیء نویسنده برای تولید سند XML می نویسد.
 * public void storeToXML(Writer w, String comment, String encoding):
 * این ویژگیها را در شیء نویسنده برای تولید سند XML با کدگذاری مشخص می نویسد
 */
public class PropertiesClass {
    public String readApplicationPropertiesValueByKey(String key) throws IOException {
        Properties properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        return properties.getProperty(key);
    }

    public String readSystemPropertiesValueByKey(String key) throws IOException {
        Properties properties =System.getProperties();
        return properties.getProperty(key);
    }
}
