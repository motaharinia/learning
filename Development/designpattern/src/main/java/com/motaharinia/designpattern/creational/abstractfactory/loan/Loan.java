package com.motaharinia.designpattern.creational.abstractfactory.loan;

public abstract class Loan {
    //نرخ سود وام
    protected Double rate;

    /**
     * این متد نرخ سود بانکی را ست میکند
     *
     * @param rate نرخ سود بانکی
     */
    public abstract void setInterestRate(Double rate);

    /**
     * این متد با توجه به مبلغ وام و نعداد سال پرداخت اقساط ، مبلغ سود را محاسبه میکند
     *
     * @param loanAmount مبلغ وام
     * @param years      تعداد سال پرداخت اقساط
     */
    public void calculateLoanPayment(Double loanAmount, Integer years) {
        /*
              to calculate the monthly loan payment i.e. EMI

              rate=annual interest rate/12*100;
              n=number of monthly installments;
              1year=12 months.
              so, n=years*12;

            */

        Double EMI;
        Integer n;

        n = years * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;

        System.out.println("your monthly EMI is " + EMI + " for the amount" + loanAmount + " you have borrowed");
    }
}
