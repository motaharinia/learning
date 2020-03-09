package com.motaharinia.designpattern.structural;

import com.motaharinia.designpattern.structural.composite.Accountant;
import com.motaharinia.designpattern.structural.composite.BankManager;
import com.motaharinia.designpattern.structural.composite.Cashier;
import com.motaharinia.designpattern.structural.composite.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/composite-pattern
//A Composite Pattern says that just "allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects".
//الگوی کامپوزیت می گوید که فقط "به مشتریها این امکان را می دهد که به شیوه ای عمومی روی اشیاء کار کنند که ممکن است نمایانگر سلسله مراتب اشیاء باشد"
public class CompositeTest {
    Employee cachier1;
    Employee cachier2;
    Employee accountant;
    Employee bankManager;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        cachier1 = null;
        cachier2 = null;
        accountant = null;
        bankManager = null;
    }


    /**
     * این متد Composite Design Pattern را تست میکند
     */
    @Test
    void compositeTest() {
        cachier1=new Cashier(101,"Sohan Kumar", 20000.0);
        cachier2=new Cashier(102,"Mohan Kumar", 25000.0);
        accountant=new Accountant(103,"Seema Mahiwal", 30000.0);
        bankManager=new BankManager(100,"Ashwani Rajput",100000.0);
        bankManager.add(cachier1);
        bankManager.add(cachier2);
        bankManager.add(accountant);
        Assertions.assertEquals(103, bankManager.getChild(2).getId().intValue());
    }
}
