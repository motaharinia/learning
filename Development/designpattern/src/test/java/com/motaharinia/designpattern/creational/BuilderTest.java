package com.motaharinia.designpattern.creational;

import com.motaharinia.designpattern.creational.builder.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
//Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"
//It is mostly used when object can't be created in single step like in the de-serialization of a complex object.
//دیزاین پترن Builder Pattern می گوید که "با استفاده از رویکرد گام به گام یک شیء پیچیده را از اشیاء ساده بسازید "
//بیشتر وقتی مورد استفاده قرار می گیرد که اشیاء را نمی توان در یک مرحله مانند سریال کردن یک شیء پیچیده ایجاد کرد.
public class BuilderTest {


    // کاربر
    User user;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        user = null;
    }


    /**
     * این متد Builder Design Pattern را تست میکند
     */
    @Test
    void builderCostTest() {
        user = new User.UserBuilder("Mostafa", "Motahari nia").age(37).phone("09124376251").address("Tehran").build();
        Assertions.assertEquals("09124376251", user.getPhone());
    }

}
