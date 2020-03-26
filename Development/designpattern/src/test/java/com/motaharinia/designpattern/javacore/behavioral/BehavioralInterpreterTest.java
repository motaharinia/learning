package com.motaharinia.designpattern.javacore.behavioral;

import com.motaharinia.designpattern.javacore.behavioral.interpreter.InfixToPostfixPattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/interpreter-pattern
//An Interpreter Pattern says that "to define a representation of grammar of a given language, along with an interpreter that uses this representation to interpret sentences in the language".
//Basically the Interpreter pattern has limited area where it can be applied.
//We can discuss the Interpreter pattern only in terms of formal grammars
// but in this area there are better solutions that is why it is not frequently used.
//This pattern can applied for parsing the expressions defined in simple grammars and sometimes in simple rule engines.
//الگوی مفسر می گوید "بازنمودی از دستور زبان یک زبان معین ، به همراه مفسر که از این بازنمایی برای تفسیر جملات در زبان استفاده می کند را تعریف کنیم".
//در اصل الگوی مفسر محدودیتی در نواحی که میتوان از آن استفاده کرد را دارد
//ما می توانیم الگوی مفسر را فقط از لحاظ دستورات رسمی مورد بحث قرار دهیم
//اما در این زمینه راه حلهای بهتری وجود دارد ، به همین دلیل اغلب از آن استفاده نمی شود.
//این الگوی می تواند برای تجزیه عبارات تعریف شده در گرامرهای ساده و گاه در موتورهای با قوانین ساده استفاده شود.
public class BehavioralInterpreterTest {
    //عبارت infix
    String inFix;
   //مفسر
    InfixToPostfixPattern infixToPostfixPattern;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        inFix = "";
        infixToPostfixPattern=new InfixToPostfixPattern();
    }

    /**
     * این متد Interpreter Design Pattern را تست میکند
     */
    @Test
    void interpreterTest() {
        inFix="a+b*c";
        Assertions.assertEquals("abc*+", infixToPostfixPattern.conversion(inFix));
    }

}
