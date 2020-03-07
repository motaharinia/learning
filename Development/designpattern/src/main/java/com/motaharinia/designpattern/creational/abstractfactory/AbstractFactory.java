package com.motaharinia.designpattern.creational.abstractfactory;

import com.motaharinia.designpattern.creational.abstractfactory.bank.Bank;
import com.motaharinia.designpattern.creational.abstractfactory.bank.BankEnum;
import com.motaharinia.designpattern.creational.abstractfactory.loan.Loan;
import com.motaharinia.designpattern.creational.abstractfactory.loan.LoanEnum;

public abstract class AbstractFactory {

    /**
     * این متد فکتوری بانک میباشد از طریق ثابت بانک مورد نظر آبجکت بانک مورد نظر را خروجی میدهد
     * @param bankEnum ثابت بانک مورد نظر
     * @return خروجی: آبجکت بانک
     */
    public abstract Bank getBank(BankEnum bankEnum);

    /**
     * این متد فکتوری وام میباشد از طریق ثابت وام مورد نظر آبجکت وام مورد نظر را خروجی میدهد
     * @param loanEnum ثابت وام مورد نظر
     * @return خروجی: آبجکت وام
     */
    public abstract Loan getLoan(LoanEnum loanEnum);
}
