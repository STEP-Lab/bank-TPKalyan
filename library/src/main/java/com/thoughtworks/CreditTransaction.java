package com.thoughtworks;

import java.util.Date;

public class CreditTransaction extends Transaction {
    private final String from;

    protected CreditTransaction(Date date, float amount, String From) {
        super(amount, date);
        from = From;
    }

    public CreditTransaction(int amount, String from) {
        this(new Date(),amount,from);
    }
}
