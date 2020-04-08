package com.motaharinia.javacore.gjavaoopsmisc.dwrapperclass;

//https://www.javatpoint.com/wrapper-class-in-java
//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
//Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.
//The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing.
//کلاس wrapper در جاوا مکانیزمی برای تبدیل primitive به شی و اشیاء به primitive را فراهم می کند.
//از  J2SE 5.0 ، با ویژگی autoboxing و unboxing ،  اشیاء را به primitive و primitive ها را به  اشیاء تبدیل می کند.
//تبدیل خودکار primitive به یک شی به عنوان autoboxing و برعکس unboxing شناخته می شود.
//
//Use of Wrapper classes in Java
//Java is an object-oriented programming language, so we need to deal with objects many times like in Collections, Serialization, Synchronization, etc.
//Let us see the different scenarios, where we need to use the wrapper classes:
//Change the value in Method:
//Java supports only call by value. So, if we pass a primitive value, it will not change the original value.
//But, if we convert the primitive value in an object, it will change the original value.
//Serialization:
//We need to convert the objects into streams to perform the serialization.
// If we have a primitive value, we can convert it in objects through the wrapper classes.
//Synchronization:
//Java synchronization works with objects in Multithreading.
//java.util package:
//The java.util package provides the utility classes to deal with objects.
//Collection Framework:
//Java collection framework works with objects only.
//All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.
//استفاده از کلاس های Wrapper در Java
//جاوا یک زبان برنامه نویسی شی گرا است ، بنابراین ما باید بارها با اشیاء مانند مجموعه ها ، سریال سازی ، همگام سازی و غیره کار کنیم.
//بگذارید سناریوهای مختلفی را ببینیم ، جایی که باید از کلاس های Wrapper استفاده کنیم.
// اجازه دهید حالات مختلف را ببینیم ، جایی که باید از کلاس های Wrapper استفاده کنیم:
// تغییر مقدار در متد:
// جاوا فقط از طریق فراخوانی با مقدار پشتیبانی می کند. بنابراین ، اگر یک مقدار primitive را پاس بدهیم ، مقدار اصلی تغییر نخواهد کرد.
// اما اگر مقدار primitive را به یک شیی تبدیل کنیم ، مقدار اصلی را تغییر می دهد.
// سریال سازی:
// برای انجام سریال سازی باید اشیاء را به استریم تبدیل کنیم.
// اگر مقدار primitive ای داشته باشیم ، می توانیم آن را از طریق کلاس های wrapper به اشیاء تبدیل کنیم.
//هماهنگ سازی:
// هماهنگ سازی جاوا با اشیاء در Multithreading کار می کند.
//java.util بسته:
// بسته java.util کلاس های ابزار را برای کار با اشیاء فراهم می کند.
// فریمورک مجموعه:
// فریمورک مجموعه جاوا فقط با اشیاء کار می کند.
// کلیه کلاس های فریمورک مجموعه (ArrayList ، LinkedList ، Vector ، HashSet ، LinkedHashSet ، TreeSet ، PriorityQueue ، ArrayDeque و غیره) فقط با اشیاء سر و کار دارند.
//
//Primitive Type	Wrapper class
//boolean	        Boolean
//char	            Character
//byte	            Byte
//short	            Short
//int	                Integer
//long	            Long
//float	            Float
//double	        Double
//
//Custom Wrapper class in Java:
//Java Wrapper classes wrap the primitive data types, that is why it is known as wrapper classes.
//We can also create a class which wraps a primitive data type. So, we can create a custom wrapper class in Java.
// کلاس Custom Wrapper در Java:
// کلاس های Java Wrapper انواع داده های primitive را بسته بندس می کنند ، به همین دلیل به عنوان کلاس های wrapper شناخته می شود.
// ما همچنین می توانیم یک کلاس ایجاد کنیم که یک نوع داده primitive را بسته بندی کند. بنابراین ، ما می توانیم یک کلاس Wrapper سفارشی در جاوا ایجاد کنیم.

public class WrapperClassInJava {


    /**
     * Autoboxing:
     * The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
     * for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
     * Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.
     * تبدیل خودکار نوع داده primitive به کلاس wrapper مربوط به آن به عنوان autoboxing شناخته می شود ،
     * به عنوان مثال ، byte to Byte، char to Character، int to Integer، long to Long، float to Float، boolean to Boolean، double to Double، و short to Short.
     * از جاوا 5 ، برای تبدیل primitive به اشیاء دیگر نیازی به استفاده از متد ValueOf  کلاس wrapper نداریم.
     *
     * @param input ورودی primitive
     * @return خروجی : wrapper
     */
    public Integer autoboxing(int input) {
        Integer result = input;
        return result;
    }

    /**
     * Unboxing:
     * The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.
     * It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives.
     * تبدیل خودکار نوع wrapper به نوع primitive مربوط به آن به عنوان unboxing شناخته شده است.
     * این روند معکوس autoboxing است. از جاوا 5 ، ما نیازی به استفاده از متد intValue کلاس های wrapper نداریم تا نوع wrapper را به primitive تبدیل کنیم.
     *
     * @param input ورودی wrapper
     * @return خروجی : primitive
     */
    public int unboxing(Integer input) {
        int result = input;
        return result;
    }
}
