package com.motaharinia.designpattern.creational;

import com.motaharinia.designpattern.creational.abstractfactory.AbstractFactory;
import com.motaharinia.designpattern.creational.abstractfactory.ChoiceEnum;
import com.motaharinia.designpattern.creational.abstractfactory.FactoryCreator;
import com.motaharinia.designpattern.creational.abstractfactory.bank.Bank;
import com.motaharinia.designpattern.creational.abstractfactory.bank.BankEnum;
import com.motaharinia.designpattern.creational.abstractfactory.loan.Loan;
import com.motaharinia.designpattern.creational.abstractfactory.loan.LoanEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//https://www.javatpoint.com/abstract-factory-pattern
//Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects
//but without specifying their concrete sub-classes.That means Abstract Factory lets a class returns a factory of classes.
//So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
//دیزاین پترن Abstract Factory Pattern می گوید که فقط برای ایجاد خانواده های اشیاء مرتبط (یا وابسته) فقط یک رابط یا کلاس انتزاعی تعریف کنید
//اما بدون مشخص کردن زیر کلاس های شفاف آنها. این بدان معنی است که کارخانه می تواند به یک کلاس اجازه دهد کارخانه ای از کلاس ها را برگرداند.
//بنابراین ، به همین دلیل است که الگوی کارخانه Abstract یک سطح بالاتر از الگوی کارخانه است.
public class AbstractFactoryTest {
    //فیلد فکتوری اصلی
    FactoryCreator factoryCreator = new FactoryCreator();
    //فکتوری زیرمجموعه که بانک میسازد
    AbstractFactory bankFactory;
    //فکتوری زیرمجموعه که وام میسازد
    AbstractFactory loanFactory;
    //نرخ سود بانکی
    Double rate;
    //مبلغ وام
    Double loanAmount;
    //تعداد سال اقساط پرداختی
    Integer years;

    /**
     * این متد مقادیر پیش فرض قبل از هر تست این کلاس تست را مقداردهی اولیه میکند
     */
    @BeforeEach
    void initUseCase() {
        bankFactory = null;
        loanFactory = null;
        rate = 5d;
        loanAmount = 100000d;
        years = 8;
    }


    /**
     * این متد فکتوری سازنده بانک در Abstract Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد بانک HDFC استفاده میشود
     */
    @Test
    void abstractFactoryBankHdfcTest() {
        bankFactory = factoryCreator.getFactory(ChoiceEnum.BANK);
        Bank bank = bankFactory.getBank(BankEnum.HDFC);
        Assertions.assertEquals(BankEnum.HDFC.getValue(), bank.getBankName());
    }


    /**
     * این متد فکتوری سازنده بانک در Abstract Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد بانک ICICI استفاده میشود
     */
    @Test
    void abstractFactoryBankIciciTest() {
        bankFactory = factoryCreator.getFactory(ChoiceEnum.BANK);
        Bank bank = bankFactory.getBank(BankEnum.ICICI);
        Assertions.assertEquals(BankEnum.ICICI.getValue(), bank.getBankName());
    }


    /**
     * این متد فکتوری سازنده بانک در Abstract Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد بانک SBI استفاده میشود
     */
    @Test
    void abstractFactoryBankSbiTest() {
        bankFactory = factoryCreator.getFactory(ChoiceEnum.BANK);
        Bank bank = bankFactory.getBank(BankEnum.SBI);
        Assertions.assertEquals(BankEnum.SBI.getValue(), bank.getBankName());
    }


    /**
     * این متد فکتوری سازنده وام در Abstract Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد وام تجاری استفاده میشود
     */
    @Test
    void abstractFactoryLoanBusinessTest() {
        loanFactory = factoryCreator.getFactory(ChoiceEnum.LOAN);
        Loan loan = loanFactory.getLoan(LoanEnum.BUSINESS);
        loan.setInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
        Assertions.assertNotNull(loan);
    }

    /**
     * این متد فکتوری سازنده وام در Abstract Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد وام تحصیلی استفاده میشود
     */
    @Test
    void abstractFactoryLoanEducationalTest() {
        loanFactory = factoryCreator.getFactory(ChoiceEnum.LOAN);
        Loan loan = loanFactory.getLoan(LoanEnum.EDUCATIONAL);
        loan.setInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
        Assertions.assertNotNull(loan);
    }

    /**
     * این متد فکتوری سازنده وام در Abstract Factory Design Pattern را تست میکند
     * از این متد برای تست ایجاد وام خانگی استفاده میشود
     */
    @Test
    void abstractFactoryLoanHomeTest() {
        loanFactory = factoryCreator.getFactory(ChoiceEnum.LOAN);
        Loan loan = loanFactory.getLoan(LoanEnum.HOME);
        loan.setInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
        Assertions.assertNotNull(loan);
    }
}
