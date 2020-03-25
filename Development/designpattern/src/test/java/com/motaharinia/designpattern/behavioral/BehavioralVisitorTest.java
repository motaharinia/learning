package com.motaharinia.designpattern.behavioral;

import com.motaharinia.designpattern.behavioral.visitor.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.geeksforgeeks.org/visitor-design-pattern/
//Visitor design pattern is one of the behavioral design patterns. It is used when we have to perform an operation on a group of similar kind of Objects.
//With the help of visitor pattern, we can move the operational logic from the objects to another class.
//الگوی طراحی بازدید کنندگان یکی از الگوهای طراحی رفتاری است. این مورد زمانی استفاده می شود که ما باید عملیاتی روی گروهی از اشیاء مشابه انجام دهیم.
// با کمک الگوی بازدید کننده می توانیم منطق عملیاتی را از اشیاء به کلاس دیگر منتقل کنیم.
public class BehavioralVisitorTest {

    //آیتمهای مورد نظر برای خرید
    ItemElement[] items;

    //بازدید کننده و محاسبه کننده آیتمهای سبد خرید
    ShoppingCartVisitor visitor;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        visitor = new ShoppingCartVisitorImpl();
        items = new ItemElement[]{
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};
    }

    /**
     * این متد Visitor Design Pattern را  تست میکند
     */
    @Test
    void visitorTest() {
        Integer sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        Assertions.assertEquals(Integer.valueOf(160), sum);
    }

}
