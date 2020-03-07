package com.motaharinia.designpattern.creational.abstractfactory;

import com.motaharinia.designpattern.creational.abstractfactory.bank.*;
import com.motaharinia.designpattern.creational.abstractfactory.loan.Loan;
import com.motaharinia.designpattern.creational.abstractfactory.loan.LoanEnum;

public class BankFactory extends AbstractFactory {
    /**
     * این متد فکتوری بانک میباشد از طریق ثابت بانک مورد نظر آبجکت بانک مورد نظر را خروجی میدهد
     *
     * @param bankEnum ثابت بانک مورد نظر
     * @return خروجی: آبجکت بانک
     */
    public Bank getBank(BankEnum bankEnum) {
        if (bankEnum == null) {
            return null;
        } else {
            switch (bankEnum) {
                case HDFC:
                    return new HDFC();
                case ICICI:
                    return new ICICI();
                case SBI:
                    return new SBI();
                default:
                    return null;
            }
        }
    }

    /**
     * این متد خروجی null بیرون میدهد چون فکتوری بانک است
     *
     * @param loanEnum ثابت وام مورد نظر
     * @return null
     */
    public Loan getLoan(LoanEnum loanEnum) {
        return null;
    }
}
