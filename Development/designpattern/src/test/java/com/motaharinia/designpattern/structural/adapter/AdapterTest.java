package com.motaharinia.designpattern.structural.adapter;

import com.motaharinia.designpattern.structural.adapter.ex1.BankCustomer;
import com.motaharinia.designpattern.structural.adapter.ex1.CreditCard;
import com.motaharinia.designpattern.structural.adapter.ex2.MemberAdapter;
import com.motaharinia.designpattern.structural.adapter.ex2.MemberCompany;
import com.motaharinia.designpattern.structural.adapter.ex2.MemberPerson;
import com.motaharinia.designpattern.structural.adapter.ex2.membercompany.CompanyAudi;
import com.motaharinia.designpattern.structural.adapter.ex2.membercompany.CompanyBmw;
import com.motaharinia.designpattern.structural.adapter.ex2.memberperson.PersonAdmin1;
import com.motaharinia.designpattern.structural.adapter.ex2.memberperson.PersonAdmin2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://medium.com/@ssaurel/implement-the-adapter-design-pattern-in-java-f9adb6a8828f
//https://www.javatpoint.com/adapter-pattern
//An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
//In other words, to provide the interface according to client requirement while using the services of a class with a different interface.
//The Adapter Pattern is also known as Wrapper.
public class AdapterTest {

    //کارت اعتباری
    CreditCard targetInterface;

    MemberPerson memberPerson;
    MemberCompany memberCompany;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        targetInterface = new BankCustomer();
        memberCompany = null;
        memberPerson = null;
    }


    /**
     * این متد مثال اول Adapter Design Pattern را تست میکند
     */
    @Test
    void adapter1Test() {
        targetInterface.giveBankDetails("Mostafa Motahari Nia", 123456L, "Test");
        Assertions.assertEquals("The Account number 123456 of Mostafa Motahari Nia in Test bank is valid", targetInterface.getCreditCard());
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
