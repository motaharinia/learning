package com.motaharinia.designpattern.javacore.structural;

import com.motaharinia.designpattern.javacore.structural.facade.ShopKeeper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/facade-pattern
//A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem,
// therefore it hides the complexities of the subsystem from the client".
//In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.
//یک الگوی نما می گوید که فقط "یک رابط یکپارچه و ساده را به مجموعه ای از رابط ها در زیر سیستم ارائه دهید
// بنابراین پیچیدگی های زیر سیستم را از مشتری پنهان می کند".
//به عبارت دیگر ، Facade Pattern رابط سطح بالاتری را توصیف می کند که استفاده از سیستم فرعی را آسان تر می کند.
public class StructuralFacadeTest {
    ShopKeeper shopKeeper;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        shopKeeper=new ShopKeeper();
    }

    /**
     * این متد Facade Design Pattern را تست میکند
     * تست گوشی Blackberry
     */
    @Test
    void facadeBlackBerryTest() {
        shopKeeper = new ShopKeeper();
        Assertions.assertEquals("Blackberry Z10:55000", shopKeeper.getBlackberrySpec());
    }


    /**
     * این متد Facade Design Pattern را تست میکند
     * تست گوشی Iphone
     */
    @Test
    void facadeIphoneTest() {
        shopKeeper = new ShopKeeper();
        Assertions.assertEquals("Iphone 6:65000", shopKeeper.getIphoneSpec());
    }

    /**
     * این متد Facade Design Pattern را تست میکند
     * تست گوشی samsung
     */
    @Test
    void facadeSamsungTest() {
        shopKeeper = new ShopKeeper();
        Assertions.assertEquals("Samsung galaxy tab 3:45000", shopKeeper.getSamsungSpec());
    }
}
