package com.motaharinia.javacore.gjavaoopsmisc.bobjectcloning;

import com.motaharinia.javacore.fjavaarray.JavaArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unitils.reflectionassert.ReflectionAssert;

import java.util.Objects;

//https://www.javatpoint.com/object-cloning
public class ObjectCloningInJavaTest {

    //متغیر تست
    ObjectCloningInJava objectCloningInJava;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        objectCloningInJava = new ObjectCloningInJava();
    }

    /**
     * این متد پیاده سازی قابلیت Anonymous Array را در فراخوانی متد تست میکند
     */
    @Test
    void javaArrayAnonymousArrayTest() throws CloneNotSupportedException {
        ReflectionAssert.assertReflectionEquals(objectCloningInJava, objectCloningInJava.clone());
    }
}
