package com.motaharinia.javacore.gjavaoopsmisc.hjavadoctool;

//https://www.javatpoint.com/creating-api-document
//We can create document api in java by the help of javadoc tool.
//In the java file, we must use the documentation comment /**... */ to post information for the class, method, constructor, fields etc.
// ما می توانیم api را در جاوا با کمک ابزار javadoc ایجاد کنیم.
// در فایل جاوا باید از توضیحات مستندات استفاده کنیم / ** ... * / برای ارسال اطلاعات برای کلاس ، متد ، سازنده ، فیلدها و غیره.
//
//To create the document API, you need to use the javadoc tool followed by java file name. There is no need to compile the javafile.
//On the command prompt, you need to write: javadoc -encoding UTF-8 JavaDoc.java
//to generate the document api. Now, there will be created a lot of html files. Open the index.html file to get the information about the classes.
// برای ایجاد API سند ، شما باید از ابزار javadoc و به دنبال آن نام فایل جاوا استفاده کنید. نیازی به کامپایل فایل جاوا نیست.
// در خط فرمان ، باید بنویسید: javadoc -encoding UTF-8 JavaDoc.java
// برای تولید api سند. اکنون ، تعداد زیادی فایل html ایجاد می شود. پرونده index.html را باز کنید تا از کلاس ها اطلاعات کسب کنید.

//1.Direct Call Run In Console:
//javadoc -encoding UTF-8 -sourcepath ./src -d ./docs -subpackages .
//2.With POM Maven Plugin Run In Console:
//mvn javadoc:javadoc
public class JavaDoc {

    /**
     * This class is a user-defined class that contains one methods cube.
     */
    public void test() {

    }
}
