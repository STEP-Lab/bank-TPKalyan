package com.thoughtworks;

public class Account {
    private final String accountNo;
    private double balance;

    public Account(String accountNo, double balance) throws MinimumBalanceException, InvalidAccountNumberException {
        if(!this.isValidAccountNo(accountNo)){
            throw new InvalidAccountNumberException();
        }
        if(balance<1000){
            throw new MinimumBalanceException();
        }
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    private Boolean isValidAccountNo(String accountNo){
        return accountNo.matches("([0-9]){4}-([0-9]){4}");
    }

    public double debit(int amount) throws InsufficientBalanceException {
        if(amount>balance){
            throw new InsufficientBalanceException();
        }
        this.balance -= amount;
        return this.balance;
    }
}
