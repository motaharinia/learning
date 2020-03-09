package com.motaharinia.designpattern.structural;

import com.motaharinia.designpattern.structural.bridge.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.geeksforgeeks.org/bridge-design-pattern/
//The Bridge design pattern allows you to separate the abstraction from the implementation.
//الگوی طراحی Bridge به شما امکان می دهد تا انتزاع را از پیاده سازی جدا کنید.
public class BridgeTest {
    TextContentHeader textContentHeader;
    TextContentComment textContentComment;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        textContentHeader = null;
        textContentComment = null;
    }

    /**
     * این متد خروجی  هدر در Bridge Design Pattern را تست میکند
     */
    @Test
    void bridgeHeaderTest() {
        textContentHeader = new TextContentHeader("Test Header Kill You",new TextFilterBadWord(),new TextFilterBold());
        Assertions.assertEquals("<h3><b>Test Header BAD_WORD You</b></h3>", textContentHeader.filter());
    }



    /**
     * این متد خروجی  کامنت در Bridge Design Pattern را تست میکند
     */
    @Test
    void bridgeCommentTest() {
        textContentComment = new TextContentComment("hello. i will kill you. i hate you",new TextFilterMaxLength(),new TextFilterBadWord());
        Assertions.assertEquals("hello. i will BAD_WORD you. i...", textContentComment.filter());
    }
}
