package com.thoughtworks;

public class InvalidAccountNumberException extends Throwable {
    public InvalidAccountNumberException() {
        super("Invalid account number");
    }
}
