package com.motaharinia.designpattern.j2ee.business;

import com.motaharinia.designpattern.j2ee.business.businessdelegate.BusinessDelegate;
import com.motaharinia.designpattern.j2ee.business.businessdelegate.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.tutorialspoint.com/design_pattern/business_delegate_pattern.htm
//Business Delegate Pattern is used to decouple presentation tier and business tier.
//It is basically use to reduce communication or remote lookup functionality to business tier code in presentation tier code.
//الگوی نماینده کسب و کار برای جدا کردن سطح ارائه و ردیف تجارت مورد استفاده قرار می گیرد.
//این اساساً برای کاهش ارتباطات یا قابلیت جستجوی راه دور از کد ردیف تجاری در کد ارائه سطح استفاده می شود.
public class BusinessDelegateTest {


    //نماینده تجاری
    BusinessDelegate businessDelegate;
    //فراخوانی کننده سرویس تجاری
    Client client;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        businessDelegate = new BusinessDelegate();
        client = new Client(businessDelegate);
    }


    /**
     * این متد J2ee Business Delegate Design Pattern را در حالت EJB تست میکند
     */
    @Test
    void j2eeBusinessDelegateEjbTest() {
        businessDelegate.setServiceType("EJB");
        String result = client.doTask();
        Assertions.assertEquals("EjbService", result);
    }

    /**
     * این متد J2ee Business Delegate Design Pattern را در حالت JMS تست میکند
     */
    @Test
    void j2eeBusinessDelegateJmsTest() {
        businessDelegate.setServiceType("JMS");
        String result = client.doTask();
        Assertions.assertEquals("JmsService", result);
    }

}
