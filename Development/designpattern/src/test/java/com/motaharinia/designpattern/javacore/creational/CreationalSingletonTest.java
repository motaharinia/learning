package com.motaharinia.designpattern.javacore.creational;

import com.motaharinia.designpattern.javacore.creational.singleton.early.EarlySingleton;
import com.motaharinia.designpattern.javacore.creational.singleton.lazy.JDBCSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/singleton-design-pattern-in-java
//Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
//In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.
//There are two forms of singleton design pattern Early Instantiation: creation of instance at load time. Lazy Instantiation: creation of instance when required.
//دیزاین پترن Singleton Pattern می گوید "كلاسی را تعریف كنید كه فقط یك نمونه از آن وجود داشته باشد و یك نقطه دسترسی جهانی به آن را فراهم كنید".
//به عبارت دیگر ، یک کلاس باید اطمینان حاصل کند که از آن فقط یک نمونه یونیک باید ایجاد شود و همه کلاسها می توانند از یک شی واحد استفاده کنند.
//دو الگوی طراحی Singleton وجود دارد شروع سریع که ایجاد نمونه در زمان اجرا انجام میشود و نمونه گیری تنبل که در صورت لزوم نمونه ایجاد میکند.
public class CreationalSingletonTest {


    //فیلدی برای تست Early Singleton Design Pattern
    private EarlySingleton earlySingleton;
    //فیلدی برای تست Lazy Singleton Design Pattern
    private JDBCSingleton lazySingleton;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        earlySingleton = null;
        lazySingleton = null;
    }

    /**
     * این متد حالت Early Singleton Design Pattern را تست میکند
     * در این حالت شیی در زمان اجرای پروژه ایجاد میشود و با متد getInstance ما آن شیی سینگلتون را میگیریم
     */
    @Test
    public void singletonEarlyTest() {
        earlySingleton = EarlySingleton.getInstance();
        Assertions.assertEquals(EarlySingleton.getInstance(), earlySingleton);
    }

    /**
     * این متد حالت Lazy Singleton Design Pattern را تست میکند
     * در این حالت شیی سینگلتون در زمان نیاز یکبار ایجاد میشود و ما آن شیی سینگلتون را میگیریم
     */
    @Test
    public void singletonLazyTest() {
        lazySingleton = JDBCSingleton.getInstance();
        Assertions.assertEquals(JDBCSingleton.getInstance(), lazySingleton);

    }
}
