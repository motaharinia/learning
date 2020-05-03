package com.motaharinia.javacore.qjavareflection.fcallprivatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * https://www.javatpoint.com/how-to-call-private-method-from-another-class-in-java
 * How to call private method from another class in java:
 * You can call the private method from outside the class by changing the runtime behaviour of the class.
 * By the help of java.lang.Class class and java.lang.reflect.Method class, we can call private method from any other class.
 * Required methods of Method class:
 * 1) public void setAccessible(boolean status) throws SecurityException:
 * sets the accessibility of the method.
 * 2) public Object invoke(Object method, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException:
 * is used to invoke the method.
 * Required method of Class class:
 * 1) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException:
 * returns a Method object that reflects the specified declared method of the class or interface represented by this Class object.
 * نحوه فراخوانی متد خصوصی از کلاس دیگر در جاوا:
 * می توانید با تغییر رفتار زمان اجرای کلاس ، از متد خصوصی خارج از کلاس تماس بگیرید.
 * با کمک کلاس java.lang.Class و کلاس java.lang.reflect.Method می توانیم از هر کلاس دیگری با متد خصوصی تماس بگیریم.
 * متدهای مورد نیاز کلاس Method:
 * 1) public void setAccessible(boolean status) throws SecurityException:
 * دسترسی به متد را تنظیم می کند.
 * 2) public Object invoke(Object method, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException:
 * برای فراخوانی متد استفاده می شود.
 * متد موردنیاز کلاس Class:
 * 1) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException:
 * یک شیء متد را که منعکس کننده متد اعلام شده کلاس یا رابط است که توسط این شیء کلاس بازتاب یافته است ، برمی گرداند
 */
public class CallPrivateMethod {
    public String callPrivate(Class clazz) throws Exception {
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getDeclaredMethod("message", null);
        method.setAccessible(true);
        String result = (String) method.invoke(instance, null);
        return result;
    }
}
