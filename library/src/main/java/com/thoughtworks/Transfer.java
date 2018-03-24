package com.thoughtworks;

import java.util.Date;

public class Transfer extends Transaction{
    private final String from;

    public Transfer(Date date, String from, String to, int amount) {
        super(amount,to,date);
        this.from = from;
    }

    public Transfer(String from, String to, double amount) {
        super(amount,to,new Date());
        this.from = from;
    }
}
