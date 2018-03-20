package com.thoughtworks;

public class Account {
    private final String accountNo;
    private int balance;

    public Account(String accountNo, int balance) throws MinimumBalanceException, InvalidAccountNumberException {
        if(!this.isValidAccountNo(accountNo)){
            System.out.println(this.isValidAccountNo(accountNo)+accountNo);
            throw new InvalidAccountNumberException();
        }
        if(balance<1000){
            throw new MinimumBalanceException();
        }
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    private Boolean isValidAccountNo(String accountNo){
        return accountNo.matches("([0-9]){4}-([0-9]){4}");
    }
}
