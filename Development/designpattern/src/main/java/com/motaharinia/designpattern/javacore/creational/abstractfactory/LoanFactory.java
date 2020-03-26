package com.motaharinia.designpattern.javacore.creational.abstractfactory;

import com.motaharinia.designpattern.javacore.creational.abstractfactory.bank.Bank;
import com.motaharinia.designpattern.javacore.creational.abstractfactory.bank.BankEnum;
import com.motaharinia.designpattern.javacore.creational.abstractfactory.loan.*;

public class LoanFactory extends AbstractFactory {

    /**
     * این متد خروجی null بیرون میدهد چون فکتوری وام است
     *
     * @param bankEnum ثابت بانک مورد نظر
     * @return null
     */
    public Bank getBank(BankEnum bankEnum) {
        return null;
    }

    /**
     * این متد فکتوری وام میباشد از طریق ثابت وام مورد نظر آبجکت وام مورد نظر را خروجی میدهد
     *
     * @param loanEnum ثابت وام مورد نظر
     * @return خروجی: آبجکت وام
     */
    public Loan getLoan(LoanEnum loanEnum) {
        if (loanEnum == null) {
            return null;
        } else {
            switch (loanEnum) {
                case BUSINESS:
                    return new BusinessLoan();
                case EDUCATIONAL:
                    return new EducationLoan();
                case HOME:
                    return new HomeLoan();
                default:
                    return null;
            }
        }
    }
}
