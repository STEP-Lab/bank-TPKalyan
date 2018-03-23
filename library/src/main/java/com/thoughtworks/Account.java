package com.thoughtworks;

public class Account {
    private double balance;
    private static final double minimumBalance = 1000;
    private AccountNumber accountNo;

    public Account(AccountNumber accountNo, double balance) throws MinimumBalanceException{
        this.accountNo = accountNo;
        if(balance<minimumBalance){
            throw new MinimumBalanceException();
        }
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public double debit(int amount) throws InsufficientBalanceException {
        if(amount>balance){
            throw new InsufficientBalanceException();
        }
        this.balance -= amount;
        return this.balance;
    }
}
