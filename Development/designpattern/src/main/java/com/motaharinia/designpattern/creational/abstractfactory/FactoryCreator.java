package com.motaharinia.designpattern.creational.abstractfactory;

public class FactoryCreator {
    /**
     * این متد فکتوری پدر است که طبق انتخاب کاربر یکی از فکتوری های زیر مجموعه خود را فراخوانی میکند
     * @param choiceEnum انتخاب کاربر
     * @return خروجی: فکتوری زیرمجموعه خود را خروجی میدهد
     */
    public static AbstractFactory getFactory(ChoiceEnum choiceEnum) {
        if (choiceEnum == null) {
            return null;
        } else {
            switch (choiceEnum) {
                case BANK:
                    return new BankFactory();
                case LOAN:
                    return new LoanFactory();
                default:
                    return null;
            }
        }
    }
}
