package com.thoughtworks;

import com.thoughtworks.DebitTransaction;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransctionTest {
    @Test
    public void mustRecordCorrectTransactionDate() {
        Date date = new Date();
        DebitTransaction transaction = new DebitTransaction(date,1000, "1234-4321");
        assertThat(transaction.getDate(),is(date));
    }
}