package com.motaharinia.designpattern.behavioral;

import com.motaharinia.designpattern.behavioral.chainofresponsibility.Chain;
import com.motaharinia.designpattern.behavioral.chainofresponsibility.DoubleProcessor;
import com.motaharinia.designpattern.behavioral.chainofresponsibility.IntegerProcessor;
import com.motaharinia.designpattern.behavioral.chainofresponsibility.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.geeksforgeeks.org/chain-responsibility-design-pattern/
//Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.
// Later, the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
//الگوی زنجیره ای از مسئولیت برای دستیابی به وابستگی کمتر در طراحی نرم افزار استفاده می شود که در آن درخواست مشتری به یک زنجیره اشیاء برای پردازش  ارسال می شود.
// بعداً ، شیء موجود در زنجیره ، خود تصمیم می گیرد که چه کسی درخواست را پردازش می کند و آیا این درخواست برای ارسال به شیء بعدی در زنجیره لازم است یا خیر.
public class BehavioralChainOfResponsibilityTest {
    Chain c1;
    Chain c2;
    Chain c3;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        c1 = new IntegerProcessor();
        c2 = new DoubleProcessor();
        c3 = new StringProcessor();
        c1.setNext(c2);
        c2.setNext(c3);
    }

    /**
     * این متد Chain Of Responsibility Design Pattern را در حالت Integer تست میکند
     */
    @Test
    void chainOfResponsibilityIntegerTest() {
        String result = c1.process(Integer.valueOf("100"));
        Assertions.assertEquals("IntegerProcessor:100", result);
    }

    /**
     * این متد Chain Of Responsibility Design Pattern را در حالت Double تست میکند
     */
    @Test
    void chainOfResponsibilityDoubleTest() {
        String result = c1.process(Double.valueOf("100.5"));
        Assertions.assertEquals("DoubleProcessor:100.5", result);
    }

    /**
     * این متد Chain Of Responsibility Design Pattern را در حالت String تست میکند
     */
    @Test
    void chainOfResponsibilityStringTest() {
        String result = c1.process(String.valueOf("1000"));
        Assertions.assertEquals("StringProcessor:1000", result);
    }
}
