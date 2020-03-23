package com.motaharinia.designpattern.behavioral;

import com.motaharinia.designpattern.behavioral.nullobject.AbstractCustomer;
import com.motaharinia.designpattern.behavioral.nullobject.CustomerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm
//In Null Object pattern, a null object replaces check of NULL object instance.
//Instead of putting if check for a null value, Null Object reflects a do nothing relationship.
//Such Null object can also be used to provide default behaviour in case data is not available.
//In Null Object pattern, we create an abstract class specifying various operations to be done,
//concrete classes extending this class and a null object class providing do nothing implemention of this class will be used seamlessly where we need to check null value.
//در الگوی Null Object ، یک شی صفر جایگزین بررسی نمونه NULL شی می شود
// به جای اینکه یک مقدار Null را بررسی کند ، شیی Null یک رابطه بدون هیچ کاری را بازتاب میدهد.
// در صورت عدم دسترسی به داده های موجود ، از این شی Null نیز می تواند برای ارائه رفتار پیش فرض استفاده شود.
//در الگوی Null Object ، یک کلاس انتزاعی ایجاد می کنیم که عملیات مختلفی را انجام می دهد ،
// کلاس های پیاده سازی شده که این کلاس را گسترش می دهند و یک کلاس شیء null که به صورت یکپارچه استفاده خواهد شد در جایی که ما بخواهیم مقدار null را بررسی کنیم
public class BehavioralNullObjectTest {

    //مشتری
    AbstractCustomer customer = CustomerFactory.getCustomer("Rob");


    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        customer = null;
    }

    /**
     * این متد NullObject Design Pattern را در حالت مشتری که وجود ندارد تست میکند
     */
    @Test
    void nullObjectNotExistTest() {
        customer = CustomerFactory.getCustomer("joy");
        Assertions.assertEquals(true, customer.isNull());
    }

    /**
     * این متد NullObject Design Pattern را در حالت مشتری واقعی تست میکند
     */
    @Test
    void nullObjectExistRealTest() {
        customer = CustomerFactory.getCustomer("Rob");
        Assertions.assertEquals(false, customer.isNull());
    }
}
