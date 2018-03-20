package com.thoughtworks;

public class Account {
    private final String accountNo;
    private int balance;

    public Account(String accountNo, int balance) throws MinimumBalanceException {
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
}
