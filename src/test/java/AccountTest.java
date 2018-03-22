import com.thoughtworks.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() throws MinimumBalanceException, InvalidAccountNumberException {
        account = new Account(new AccountNumber("1234-4321"), 1024);
    }

    @Test

    public void getBalance(){
        assertEquals(1024, account.getBalance(),0);
    }

    @Test(expected = MinimumBalanceException.class)
    public void minimumBalanceException() throws MinimumBalanceException, InvalidAccountNumberException {
        Account account = new Account(new AccountNumber("1234-4321"), 199);
    }

    @Test
    public void debit() throws InsufficientBalanceException {
        assertEquals(900,account.debit(124),0);
    }

    @Test(expected = InsufficientBalanceException.class)
    public void insufficentBalanceException() throws  InsufficientBalanceException {
        account.debit(1500);
    }
}
