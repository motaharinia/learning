package com.motaharinia.javacore.tjava9feachers.danonymousclasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * https://www.javatpoint.com/java-9-anonymous-classes
 */
public class Java9AnonymousInnerClassesTest {
    //متغیر تست
    Java9AnonymousInnerClasses java9AnonymousInnerClasses;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        java9AnonymousInnerClasses = new Java9AnonymousInnerClasses();
    }

    /**
     * این متد ، استفاده از DiamondOperator در کلاس داخلی ناشناخته را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9AnonymousInnerClassesTest() throws Exception {
        Assertions.assertEquals("Java9", java9AnonymousInnerClasses.useDiamondOperator());
    }
}
