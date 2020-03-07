package com.motaharinia.designpattern.creational;

import com.motaharinia.designpattern.creational.factorymethod.PlanFactory;
import com.motaharinia.designpattern.creational.factorymethod.plan.Plan;
import com.motaharinia.designpattern.creational.factorymethod.plan.PlanEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//https://www.javatpoint.com/factory-method-design-pattern
//A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object
//but let the subclasses decide which class to instantiate.
//In other words, subclasses are responsible to create the instance of the class.
public class FactoryMethodTest {

    //فکتوری طرح مصرف برق
    private PlanFactory planFactory = new PlanFactory();

    //طرح مصرف برق
    private Plan plan;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        plan = null;
    }


    /**
     * این متد فکتوری سازنده طرح مصرف برق در Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد طرح مصرف برق تجاری استفاده میشود
     */
    @Test
    void factoryMethodCommercialTest() {
        plan = planFactory.getPlan(PlanEnum.COMMERCIAL_PLAN);
        Assertions.assertEquals(75, plan.calculateBill(10));
    }


    /**
     * این متد فکتوری سازنده طرح مصرف برق در Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد طرح مصرف برق خانگی استفاده میشود
     */
    @Test
    void factoryMethodDomesticTest() {
        plan = planFactory.getPlan(PlanEnum.DOMESTIC_PLAN);
        Assertions.assertEquals(35, plan.calculateBill(10));
    }


    /**
     * این متد فکتوری سازنده طرح مصرف برق در Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد طرح مصرف برق موسسه استفاده میشود
     */
    @Test
    void factoryMethodInstitutionalTest() {
        plan = planFactory.getPlan(PlanEnum.INSTITUTIONAL_PLAN);
        Assertions.assertEquals(55, plan.calculateBill(10));
    }

    /**
     * این متد فکتوری سازنده طرح مصرف برق در Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد طرح مصرف برق در شرایطی که مقدار ورودی null باشد استفاده میشود
     */
    @Test
    void factoryMethodNullTest() {
        plan = planFactory.getPlan(null);
        Assertions.assertNull(plan);
    }
}
