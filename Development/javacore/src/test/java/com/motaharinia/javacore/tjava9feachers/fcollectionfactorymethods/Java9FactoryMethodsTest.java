package com.motaharinia.javacore.tjava9feachers.fcollectionfactorymethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.javatpoint.com/java-9-factory-methods
 */
public class Java9FactoryMethodsTest {
    //متغیر تست
    Java9FactoryMethods java9FactoryMethods;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        java9FactoryMethods = new Java9FactoryMethods();
    }

    /**
     * این متد ، استفاده از Collection Factory Method لیست را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9FactoryMethodsListTest() throws Exception {
        Assertions.assertEquals("Hibernate,Java,JavaFX,Jsp,Spring", java9FactoryMethods.collectionFactoryList());
    }

    /**
     * این متد ، استفاده از Collection Factory Method ست را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9FactoryMethodsSetTest() throws Exception {
        Assertions.assertEquals("Hibernate,Java,JavaFX,Jsp,Spring", java9FactoryMethods.collectionFactorySet());
    }

    /**
     * این متد ، استفاده از Collection Factory Method مپ را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9FactoryMethodsMapTest() throws Exception {
        Assertions.assertEquals("Hibernate,Java,JavaFX,Jsp,Spring", java9FactoryMethods.collectionFactoryMap());
    }

    /**
     * این متد ، استفاده از Collection Factory Method مپ به کمک ofEntries را در جاوا 9 تست میکند
     *
     * @throws Exception
     */
    @Test
    public void java9FactoryMethodsMapOfEntriesTest() throws Exception {
        Assertions.assertEquals("Hibernate,Java,JavaFX,Jsp,Spring", java9FactoryMethods.collectionFactoryMapOfEntries());
    }
}
