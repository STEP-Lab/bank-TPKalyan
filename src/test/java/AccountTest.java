import com.thoughtworks.Account;
import com.thoughtworks.InsufficientBalanceException;
import com.thoughtworks.InvalidAccountNumberException;
import com.thoughtworks.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() throws MinimumBalanceException, InvalidAccountNumberException {
        account = new Account("1234-4321", 1024);
    }

    @Test

    public void getBalance(){
        assertEquals(1024, account.getBalance(),0);
    }

    @Test
    public void getAccountNo(){
        assertEquals("1234-4321",account.getAccountNo());
    }

    @Test(expected = MinimumBalanceException.class)
    public void minimumBalanceException() throws MinimumBalanceException, InvalidAccountNumberException {
        Account account = new Account("1234-4321", 199);
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void invalidAccountNumberException() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account("12",9000);
    }

    @Test
    public void debit() throws MinimumBalanceException, InvalidAccountNumberException, InsufficientBalanceException {
        assertEquals(900,account.debit(124),0);
    }

    @Test(expected = InsufficientBalanceException.class)
    public void insufficentBalanceException() throws MinimumBalanceException, InvalidAccountNumberException, InsufficientBalanceException {
        account.debit(1500);
    }
}
