package com.thoughtworks;

import java.util.Date;
import java.util.Objects;

public class Transaction {
    protected final float amount;
    protected final String to;
    protected Date date;

    public Transaction(float amount, String To, Date date) {
        this.amount = amount;
        to = To;
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
        return Float.compare(that.amount, amount) == 0 &&
                Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount, to);
    }
}
