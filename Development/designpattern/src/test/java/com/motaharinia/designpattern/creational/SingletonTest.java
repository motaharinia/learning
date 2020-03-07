package com.motaharinia.designpattern.creational;

import com.motaharinia.designpattern.creational.singleton.early.EarlySingleton;
import com.motaharinia.designpattern.creational.singleton.lazy.JDBCSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SingletonTest {


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
