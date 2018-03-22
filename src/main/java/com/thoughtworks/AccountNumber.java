package com.thoughtworks;

public class AccountNumber {
    private String accountNumber;

    public AccountNumber(String accountNumber) throws InvalidAccountNumberException {
        if(!isValid(accountNumber)){
            throw new InvalidAccountNumberException();
        }
        this.accountNumber = accountNumber;
    }

    private boolean isValid(String accountNumber) {
        return accountNumber.matches("\\d{4}-\\d{4}");
    }
}
