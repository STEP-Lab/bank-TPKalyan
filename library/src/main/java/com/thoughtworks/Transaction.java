package com.thoughtworks;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    protected final double amount;
    protected Date date;

    public Transaction(double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }

    public double getAmount() {
        return amount;
    }
}