package com.thoughtworks;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;

import static org.hamcrest.CoreMatchers.hasItems;
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
    public void mustCheckCreditAndDebitTransactions() {
        transactions.debit(1000,"nelluru peddareddy");
        transactions.credit(1000,"nelluru peddareddy");
        assertThat(transactions.getList(),hasItems(new DebitTransaction(new Date(),1000,"nelluru peddareddy"),new CreditTransaction(new Date(),1000,"nelluru peddareddy")));
    }

    @Test
    public void mustRecordCreditTransaction() {
        transactions.credit(1000,"nelluru peddareddy");
        assertThat(transactions.getList(),hasItem(new CreditTransaction(new Date(),1000,"nelluru peddareddy")));
    }

    @Test
    public void mustRecordTransferTransaction() {
        transactions.transfer("Suyog","Raghu",5000);
        assertThat(transactions.getList(),hasItem(new Transfer(new Date(),"Suyog","Raghu",5000)));
    }

    @Test
    public void filterTransactionsByAmount() {
        transactions.credit(5000,"bhanu");
        transactions.credit(3000,"mani");
        transactions.credit(1000,"mani");
        Transactions filteredTransactions = transactions.filterByAmountGreaterThan(2000);
        assertThat(filteredTransactions.getList(),hasItems(new CreditTransaction(5000,"bhanu"),new CreditTransaction(3000,"mani")));
    }

    @Test
    public void printTransactions() throws FileNotFoundException, UnsupportedEncodingException {
        ArrayList<String> expected = new ArrayList<>();
        transactions.credit(500,"asdf");
        transactions.debit(500,"asdf");
        PrintWriter writer = new PrintWriter("the-file-name.txt","UTF-8"){
            @Override
            public void println(String t) {
                expected.add(t);
            }
        };
        transactions.print(writer);
        writer.close();
        assertThat(expected,hasItems(new CreditTransaction(500,"asdf").toString(),new DebitTransaction(500,"asdf").toString()));
    }
}
