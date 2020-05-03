package com.motaharinia.javacore.qjavareflection.areflectionapiopenlink;

/**
 * https://www.javatpoint.com/java-reflection
 * Java Reflection is a process of examining or modifying the run time behavior of a class at run time.
 * The java.lang.Class class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.
 * The java.lang and java.lang.reflect packages provide classes for java reflection.
 * Where it is used
 * The Reflection API is mainly used in:
 * 1.IDE (Integrated Development Environment) e.g. Eclipse, MyEclipse, NetBeans etc.
 * 2.Debugger
 * 3.Test Tools etc.
 * java.lang.Class class:
 * The java.lang.Class class performs mainly two tasks:
 * provides methods to get the metadata of a class at run time.
 * provides methods to examine and change the run time behavior of a class.
 * بازتاب جاوا یک فرایند بررسی یا اصلاح رفتار زمان اجرای یک کلاس در زمان اجرا است.
 * کلاس java.lang.Class متدهای زیادی را ارائه می دهد که می تواند برای بدست آوردن metadata ، بررسی و تغییر رفتار زمان اجرای یک کلاس ارائه شود.
 * بسته های java.lang و java.lang.reflect کلاس هایی برای بازتاب جاوا فراهم می کند.
 * جایی که استفاده می شود:
 * بازتاب جاوا عمدتاً در موارد زیر استفاده می شود:
 * 1.ابزار توسعه (محیط توسعه یکپارچه) به عنوان مثال Eclipse ، MyEclipse ، NetBeans و غیره
 * 2.دیباگر
 * 3.ابزارهای تست و غیره
 * کلاس java.lang.Class:
 * کلاس java.lang.Class عمدتاً دو وظیفه را انجام می دهد:
 * متد هایی را برای به دست آوردن metadata های یک کلاس در زمان اجرا فراهم می کند.
 * متد هایی برای بررسی و تغییر رفتار زمان اجرای کلاس ارائه می دهد.
 *
 * Commonly used methods of Class class:
 * 1) public String getName()
 * returns the class name
 * 2) public static Class forName(String className)throws ClassNotFoundException
 * loads the class and returns the reference of Class class.
 * 3) public Object newInstance()throws InstantiationException,IllegalAccessException
 * creates new instance.
 * 4) public boolean isInterface()
 * checks if it is interface.
 * 5) public boolean isArray()
 * checks if it is array.
 * 6) public boolean isPrimitive()
 * checks if it is primitive.
 * 7) public Class getSuperclass()
 * returns the superclass class reference.
 * 8) public Field[] getDeclaredFields()throws SecurityException
 * returns the total number of fields of this class.
 * 9) public Method[] getDeclaredMethods()throws SecurityException
 * returns the total number of methods of this class.
 * 10) public Constructor[] getDeclaredConstructors()throws SecurityException
 * returns the total number of constructors of this class.
 * 11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException
 * returns the method class instance.
 * متدهای متداول کلاس Class:
 * 1) public String getName()
 * نام کلاس را برمی گرداند
 * 2) public static Class forName(String className)throws ClassNotFoundException
 * کلاس را بارگیری می کند و مرجع کلاس Class را برمی گرداند
 * 3) public Object newInstance()throws InstantiationException,IllegalAccessException
 * نمونه جدیدی ایجاد می کند.
 * 4) public boolean isInterface()
 * بررسی می کند اگر رابط باشد.
 * 5) public boolean isArray()
 * بررسی می کند اگر آرایه باشد.
 * 6) public boolean isPrimitive()
 * بررسی می کند اگر ابتدایی باشد
 * 7) public Class getSuperclass()
 * مرجع کلاس پدر را برمی گرداند.
 * 8) public Field[] getDeclaredFields()throws SecurityException
 * تعداد کل فیلدهای این کلاس را برمی گرداند.
 * 9) public Method[] getDeclaredMethods()throws SecurityException
 * تعداد کل متدهای این کلاس را برمی گرداند.
 * 10) public Constructor[] getDeclaredConstructors()throws SecurityException
 * تعداد سازندگان این کلاس را برمی گرداند.
 * 11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException
 * نمونه کلاس متد را برمی گرداند.
 *
 * How to get the object of Class class?
 * There are 3 ways to get the instance of Class class. They are as follows:
 * 1) forName() method of Class class:
 * is used to load the class dynamically.
 * returns the instance of Class class.
 * It should be used if you know the fully qualified name of class.This cannot be used for primitive types.
 * 2) getClass() method of Object class:
 * It returns the instance of Class class. It should be used if you know the type. Moreover, it can be used with primitives.
 * 3) The .class syntax:
 * If a type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type.
 * It can be used for primitive data type also.
 * چگونه می توان شی کلاس را بدست آورد؟
 * 3 روش برای به دست آوردن نمونه کلاس Class وجود دارد. آنها به شرح زیر است:
 * 1) forName() method of Class class:
 * برای بارگذاری کلاس به صورت پویا استفاده می شود.
 * نمونه کلاس را برمی گرداند.
 * اگر از نام کاملاً FQDN کلاس اطلاع دارید ، باید استفاده شود. این برای انواع ابتدایی قابل استفاده نیست.
 * 2) getClass() method of Object class:
 * نمونه کلاس را برمی گرداند. اگر نوع آن را بدانید باید از آن استفاده شود. علاوه بر این ، می توان از آن برای primitives استفاده کرد.
 * 3) The .class syntax:
 * اگر یک نوع موجود باشد اما نمونه ای وجود ندارد ، می توان با پیوست کردن ".class" به نام نوع ، کلاس را بدست آورد.
 * می توان از آن برای نوع داده اولیه نیز استفاده کرد.
 *
 * Determining the class object
 * Following methods of Class class is used to determine the class object:
 * 1) public boolean isInterface():
 * determines if the specified Class object represents an interface type.
 * 2) public boolean isArray():
 * determines if this Class object represents an array class.
 * 3) public boolean isPrimitive():
 * determines if the specified Class object represents a primitive type.
 * تعیین شی کلاس
 * برای تعیین شی کلاس از متدهای کلاس Class استفاده می شود:
 * 1) public boolean isInterface():
 * تعیین می کند که آیا کلاس مشخص شده یک نوع رابط را نشان می دهد یا خیر.
 * 2) public boolean isArray():
 * تعیین می کند که آیا این شیء کلاس یک کلاس آرایه را نشان می دهد یا خیر.
 * 3) public boolean isPrimitive():
 * تعیین می کند که آیا شیء کلاس مشخص شده نوع ابتدایی را نشان می دهد یا خیر.
 */
public class ReflectionApi {
    public Class getClassByForName(String className) throws ClassNotFoundException {
        return Class.forName(className);
    }

    public Class getClassByObject() throws ClassNotFoundException {
        Simple simple = new Simple();
        return simple.getClass();
    }

    public Class getClassByPrimitive() throws ClassNotFoundException {
        return boolean.class;
    }

}


class Simple {
}