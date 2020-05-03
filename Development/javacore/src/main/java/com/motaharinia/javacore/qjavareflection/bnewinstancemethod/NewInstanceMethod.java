package com.motaharinia.javacore.qjavareflection.bnewinstancemethod;

import java.lang.reflect.InvocationTargetException;

/**
 * https://www.javatpoint.com/new-instance()-method
 * newInstance() method
 * The newInstance() method of Class class and Constructor class is used to create a new instance of the class.
 * The newInstance() method of Class class can invoke zero-argument constructor whereas newInstance() method of Constructor class can invoke any number of arguments.
 * So Constructor class is preferred over Class class.
 * متد newInstance ()
 * از متد newInstance کلاس Class و کلاس سازنده برای ایجاد نمونه جدید کلاس استفاده می شود.
 * متد newInstance کلاس Class می تواند از سازنده آرگومان صفر استفاده کند در حالی که متد newInstance کلاس سازنده می تواند هر تعداد آرگومان را فراخوانی کند.
 * بنابراین کلاس سازنده نسبت به کلاس Class ارجح است.
 *
 * Syntax of newInstance() method of Class class:
 * public T newInstance()throws InstantiationException,IllegalAccessException
 * Here T is the generic version. You can think it like Object class. You will learn about generics later.
 * در اینجا T نسخه ژنریک است. می توانید مثل کلاس Object فکر کنید. بعداً در مورد ژنریک یاد خواهید گرفت.
 */
public class NewInstanceMethod {
    /**
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public String method1() throws Exception {
        Class clazz = Class.forName("com.motaharinia.javacore.qjavareflection.bnewinstancemethod.Simple");
        /**
         * newInstance Deprecated in Java9(Java 9 replace Class.newInstance):
         * 1)Simple simple=(Simple)clazz.newInstance();
         * 2)Simple simple = (Simple) clazz.getDeclaredConstructor().newInstance();
         * 3)Simple simple = (Simple) clazz.getConstructor().newInstance();
         * Both perform the same run-time check to verify the caller's access, if the constructor is not public.
         * The only difference is that #2 wraps any checked exceptions instead of directly throwing.
         * Otherwise they are identical and you can replace one with the other.
         * But #3 is different. because it can only return a public constructor.
         * It throws a NoSuchMethodException if the constructor is not public.
         * So you can't change it to getConstructor() unless you know the constructor is public.
         *منسوخ شدن newInstance در Java9 (جاوا 9 و جایگزین Class.newInstance):
         * 1)Simple simple=(Simple)clazz.newInstance();
         * 2)Simple simple = (Simple) clazz.getDeclaredConstructor().newInstance();
         * 3)Simple simple = (Simple) clazz.getConstructor().newInstance();
         * اگر سازنده عمومی نباشد ، هر دو  شماره 1و2 چک زمان اجرا را برای تأیید دسترسی فراخوانی کننده انجام می دهند.
         * تنها تفاوت این است که شماره 2 به جای پرتاب مستقیم هر استثناء بررسی شده را می پوشاند.
         * در غیر این صورت آنها یکسان هستند و شما می توانید یکی دیگر را جایگزین آن کنید.
         * اما شماره 3 متفاوت است. زیرا فقط می تواند یک سازنده عمومی را برگرداند.
         * اگر سازنده عمومی نباشد ، NoSuchMethodException را پرتاب می کند.
         * بنابراین شما نمی توانید آن را به getConstructor تغییر دهید مگر اینکه بدانید سازنده عمومی است.
         */
        Simple simple = (Simple) clazz.getDeclaredConstructor().newInstance();
        return simple.message();
    }
}

class Simple {
    String message() {
        return ("Hello Java");
    }
}