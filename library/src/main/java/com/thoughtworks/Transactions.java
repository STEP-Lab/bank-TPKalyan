package com.thoughtworks;

import java.util.ArrayList;

public class Transactions {
    public Transactions() {
        list = new ArrayList<>();
    }

    private ArrayList<Transaction> list;

    public void debit(int amount, String to) {
        list.add(new DebitTransaction(amount,to));
    }

    public void credit(int amount, String from) {
        list.add(new CreditTransaction(amount, from));
    }

    public ArrayList<Transaction> getList() {
        return list;
    }

    public void transfer(String from, String to, double amount) {
        list.add(new Transfer(from,to,amount));
    }
}

