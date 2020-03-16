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
public class StructuralCompositeTest {
    Employee cashier1;
    Employee cashier2;
    Employee accountant;
    Employee bankManager;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        cashier1 = null;
        cashier2 = null;
        accountant = null;
        bankManager = null;
    }


    /**
     * این متد Composite Design Pattern را تست میکند
     */
    @Test
    void compositeTest() {
        cashier1 =new Cashier(101,"Mostafa Motaharinia", 2000000.0);
        cashier2 =new Cashier(102,"Ali Akbari", 2500000.0);
        accountant=new Accountant(103,"Shima Abdi", 3000000.0);
        bankManager=new BankManager(100,"Babak Shoari",10000000.0);
        bankManager.add(cashier1);
        bankManager.add(cashier2);
        bankManager.add(accountant);
        Assertions.assertEquals(103, bankManager.getChild(2).getId().intValue());
    }
}
