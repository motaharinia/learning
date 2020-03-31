package com.motaharinia.javacore.objectclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/this-keyword
public class ThisTest {
This thisVar;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        thisVar=null;
    }


    /**
     * این متد نحوه استفاده از this را تست میکند
     */
    @Test
    void thisTest() {
        thisVar = new This(2);
        This2 this2=new This2(thisVar);
        Assertions.assertEquals(10, this2.getMe().thisVar.id);
    }

}
