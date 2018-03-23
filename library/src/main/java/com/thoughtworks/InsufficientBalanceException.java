package com.thoughtworks;

public class InsufficientBalanceException extends Throwable {
    public InsufficientBalanceException() {
        super("Insufficient balance");
    }
}
