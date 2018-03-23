package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class TransactionsTest {

    private Transactions transactions;

    @Before
    public void setUp() {
        transactions = new Transactions();
    }

    @Test
    public void mustRecordDebitTransaction() {
        transactions.debit(1000,"nelluru peddareddy");
        assertThat(transactions.getList(),hasItem(new DebitTransaction(new Date(),1000,"nelluru peddareddy")));
    }
    @Test
    public void mustRecordCreditTransaction() {
        transactions.credit(1000,"nelluru peddareddy");
        assertThat(transactions.getList(),hasItem(new CreditTransaction(new Date(),1000,"nelluru peddareddy")));
    }

}
