package com.thoughtworks;

import java.util.ArrayList;
import java.util.Date;

public class Transactions {
    public Transactions() {
        list = new ArrayList<>();
    }

    protected ArrayList<Transaction> list;

    public void debit(int amount, String to) {
        list.add(new DebitTransaction(amount,to));
    }
}
