package com.thoughtworks;

import java.util.Date;

public class DebitTransaction extends Transaction {

    private final String to;

    protected DebitTransaction(Date date, float amount, String To) {
        super(amount, date);
        to = To;
    }

    public DebitTransaction(float amount, String to) {
        this(new Date(),amount, to);
    }
}
