package com.motaharinia.designpattern.javacore.creational.abstractfactory.loan;

public class BusinessLoan extends Loan {

    /**
     * این متد نرخ سود بانکی را ست میکند
     *
     * @param rate نرخ سود بانکی
     */
    public void setInterestRate(Double rate) {
        this.rate = rate;
    }
}

