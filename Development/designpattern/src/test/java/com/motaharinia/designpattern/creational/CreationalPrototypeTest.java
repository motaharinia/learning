package com.motaharinia.designpattern.creational;

import com.motaharinia.designpattern.creational.prototype.EmployeeRecord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unitils.reflectionassert.ReflectionAssert;

//https://www.javatpoint.com/prototype-design-pattern
//Prototype Pattern says that cloning of an existing object instead of creating new one and can also be customized as per the requirement.
//This pattern should be followed, if the cost of creating a new object is expensive and resource intensive.
//دیزاین پترن Prototype Pattern می گوید که به جای ایجاد یک شیی جدید مشابه آن را از شیی موجود کلون کرد  و همچنین می تواند طبق نیاز مورد نظر شخصی سازی شود.
//در صورتی که هزینه ایجاد یک شیء جدید گران و منابع فشرده باشد ، این الگو باید دنبال شود.
public class CreationalPrototypeTest {

    // ریکورد کارمند اول
    private EmployeeRecord employeeRecord1;
    // ریکورد کارمند دوم
    private EmployeeRecord employeeRecord2;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        employeeRecord1 = null;
        employeeRecord2 = null;
    }

    /**
     * این متد Prototype Design Pattern را تست میکند
     * بعد از ایجاد یک آبجکت از شیی کارمند برای ساخت شیی دوم کارمند مشابه از متد getClone شیی اول استفاده میکند
     */
    @Test
    public void prototypeTest() {
        employeeRecord1 = new EmployeeRecord(1, "Mostafa Motahari nia", "Admin", 120000d, "Tehran");
        employeeRecord2 = (EmployeeRecord) employeeRecord1.getClone();
        ReflectionAssert.assertReflectionEquals(employeeRecord1, employeeRecord2);
    }
}
