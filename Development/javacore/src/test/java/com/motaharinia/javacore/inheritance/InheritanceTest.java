package com.motaharinia.javacore.inheritance;

import com.motaharinia.javacore.objectclass.ObjectInitialize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/inheritance-in-java
public class InheritanceTest {

    //سگ
    Dog dog;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        dog = new Dog();
    }

    /**
     * این متد وراثت را تست میکند
     */
    @Test
    void inheritanceTest() {
        dog.eat();
        dog.bark();
        Assertions.assertEquals(5, dog.getEnergy());
    }


}
