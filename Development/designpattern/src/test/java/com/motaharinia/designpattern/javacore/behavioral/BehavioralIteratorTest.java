package com.motaharinia.designpattern.javacore.behavioral;

import com.motaharinia.designpattern.javacore.behavioral.iterator.Iterator;
import com.motaharinia.designpattern.javacore.behavioral.iterator.StringCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/iterator-pattern
//According to Gang of Four (GoF)(Design Pattern book authers Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides), Iterator Pattern is used "to access the elements of an aggregate object sequentially without exposing its underlying implementation".
//The Iterator pattern is also known as Cursor.
//In collection framework, we are now using Iterator that is preferred over Enumeration.
//طبق گفته GoF که مخفف گروه چهار نفره نویسنده کتاب Design Pattern هستند ، از الگوی Iterator "برای دسترسی به عناصر یک شیء تجمعی بدون افشای پیاده سازی زیرساخت آن" استفاده می شود.
//الگوی Iterator نیز با عنوان Cursor شناخته می شود.
//در چارچوب Collection ، اکنون از Iterator استفاده می کنیم که بیش از Enumeration ارجح است.
public class BehavioralIteratorTest {
    Iterator stringCollection;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        stringCollection = null;
    }

    /**
     * این متد Iterator Design Pattern را تست میکند
     */
    @Test
    void iteratorTest() {
        stringCollection = new StringCollection(new String[]{"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"});
        Assertions.assertEquals("Ashwani Rajput", stringCollection.next());
    }
}
