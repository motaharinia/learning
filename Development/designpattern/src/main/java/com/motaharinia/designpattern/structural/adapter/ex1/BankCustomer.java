package com.motaharinia.designpattern.structural.adapter.ex1;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails(String customerName,Long accountNumber ,String bankName) {
            setAccountHolderName(customerName);
            setAccountNumber(accountNumber);
            setBankName(bankName);
    }

    @Override
    public String getCreditCard() {
        Long accountNumber = getAccountNumber();
        String accountHolderName = getAccountHolderName();
        String bankName = getBankName();
        return ("The Account number " + accountNumber + " of " + accountHolderName + " in " + bankName + " bank is valid");
    }
}
