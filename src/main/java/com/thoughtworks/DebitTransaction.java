package com.thoughtworks;

import java.util.Date;

public class DebitTransaction extends Transaction {

    protected DebitTransaction(Date date, float amount, String To) {
        super(amount, To, date);
    }

    public DebitTransaction(float amount, String to) {
        this(new Date(),amount, to);
    }
}
