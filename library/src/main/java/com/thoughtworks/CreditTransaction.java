package com.thoughtworks;

import java.util.Date;

public class CreditTransaction extends Transaction {
    protected CreditTransaction(Date date,float amount, String From) {
        super(amount, From, date);
    }

    public CreditTransaction(int amount, String from) {
        this(new Date(),amount,from);
    }
}
