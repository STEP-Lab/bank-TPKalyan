package com.thoughtworks;

import java.util.Date;

public class Transfer extends Transaction{
    private final String from;
    private final String to;

    public Transfer(Date date, String from, String to, int amount) {
        super(amount,date);
        this.from = from;
        this.to = to;
    }

    public Transfer(String from, String to, double amount) {
        super(amount,new Date());
        this.from = from;
        this.to = to;
    }
}
