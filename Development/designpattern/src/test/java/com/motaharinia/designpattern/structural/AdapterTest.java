package com.motaharinia.designpattern.structural;

import com.motaharinia.designpattern.structural.adapter.MemberAdapter;
import com.motaharinia.designpattern.structural.adapter.MemberCompany;
import com.motaharinia.designpattern.structural.adapter.MemberPerson;
import com.motaharinia.designpattern.structural.adapter.membercompany.CompanyAudi;
import com.motaharinia.designpattern.structural.adapter.membercompany.CompanyBmw;
import com.motaharinia.designpattern.structural.adapter.memberperson.PersonAdmin1;
import com.motaharinia.designpattern.structural.adapter.memberperson.PersonAdmin2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f
//An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
//In other words, to provide the interface according to client requirement while using the services of a class with a different interface.
//The Adapter Pattern is also known as Wrapper.
//یک الگوی آداپتور می گوید "رابط یک کلاس را به یک رابط دیگر که مشتری می خواهد تبدیل کنیم".
//به عبارت دیگر ، تأمین رابط با توجه به نیاز مشتری در حین استفاده از خدمات یک کلاس با رابط متفاوت.
//الگوی آداپتور همچنین به عنوان Wrapper معروف است.
public class AdapterTest {

    MemberPerson memberPerson;
    MemberCompany memberCompany;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        memberCompany = null;
        memberPerson = null;
    }


    /**
     * این متد خروجی شرکت AUDI در Adapter Design Pattern را تست میکند
     */
    @Test
    void adapterMemberCompanyAudiTest() {
        memberCompany = new CompanyAudi();
        Assertions.assertEquals("AUDI", memberCompany.getName());
    }

    /**
     * این متد خروجی شرکت AUDI در Adapter Design Pattern را تست میکند
     */
    @Test
    void adapterMemberCompanyBmwTest() {
        memberCompany = new CompanyBmw();
        Assertions.assertEquals("BMW", memberCompany.getName());
    }


    /**
     * این متد خروجی نام کاربر حقیقی  Admin1 در Adapter Design Pattern را تست میکند
     */
    @Test
    void adapterMemberCompanyAdmin1Test() {
        memberCompany = new MemberAdapter(new PersonAdmin1());
        Assertions.assertEquals("Bill Gates", memberCompany.getName());
    }

    /**
     * این متد خروجی نام کاربر حقیقی  Admin2 در Adapter Design Pattern را تست میکند
     */
    @Test
    void adapterMemberCompanyAdmin2Test() {
        memberCompany = new MemberAdapter(new PersonAdmin2());
        Assertions.assertEquals("Mostafa Motaharinia", memberCompany.getName());
    }
}
