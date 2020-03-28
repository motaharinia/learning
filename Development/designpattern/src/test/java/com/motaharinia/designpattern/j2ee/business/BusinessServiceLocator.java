package com.motaharinia.designpattern.j2ee.business;

import com.motaharinia.designpattern.j2ee.business.servicelocator.Service;
import com.motaharinia.designpattern.j2ee.business.servicelocator.ServiceLocator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.geeksforgeeks.org/service-locator-pattern/
//The service locator pattern is a design pattern used in software development to encapsulate the processes involved in obtaining a service with a strong abstraction layer.
//This pattern uses a central registry known as the “service locator” which on request returns the information necessary to perform a certain task.
//The ServiceLocator is responsible for returning instances of services when they are requested for by the service consumers or the service clients.
//الگوی سرویس یاب الگوی طراحی است که در توسعه نرم افزار مورد استفاده قرار می گیرد تا فرآیندهای درگیر در به دست آوردن یک سرویس با یک لایه انتزاع قوی را در بر بگیرد.
//این الگوی از یک رجیستری مرکزی موسوم به "سرویس یاب" استفاده می کند که در صورت درخواست اطلاعات لازم برای انجام یک کار خاص را برمی گرداند.
//یک ServiceLocator وظیفه بازگرداندن موارد خدمات را در هنگام درخواست آنها توسط مصرف کنندگان خدمات یا مشتری های خدمات بر عهده دارد.
public class BusinessServiceLocator {

    //سرویس
    Service service1;

    //سرویس
    Service service2;


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        service1 = null;
        service2 = null;
    }


    /**
     * این متد J2ee Service Locator Design Pattern را برای سرویس اول تست میکند
     */
    @Test
    void j2eeServiceLocatorServiceOneTest() {
        service1 = ServiceLocator.getService("ServiceOne");
        service2 = ServiceLocator.getService("ServiceOne");
        Assertions.assertEquals(service1, service2);
    }


    /**
     * این متد J2ee Service Locator Design Pattern را برای سرویس دوم تست میکند
     */
    @Test
    void j2eeServiceLocatorServiceTwoTest() {
        service1 = ServiceLocator.getService("ServiceTwo");
        service2 = ServiceLocator.getService("ServiceTwo");
        Assertions.assertEquals(service1, service2);
    }
}
