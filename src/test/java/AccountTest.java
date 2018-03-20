import com.thoughtworks.Account;
import com.thoughtworks.InvalidAccountNumberException;
import com.thoughtworks.MinimumBalanceException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test

    public void getBalance() throws MinimumBalanceException, InvalidAccountNumberException {
        Account account = new Account("1234-4321", 1024);
        assertEquals(1024,account.getBalance());
    }

    @Test
    public void getAccountNo() throws MinimumBalanceException, InvalidAccountNumberException {
        Account account = new Account("4321-1234", 5000);
        assertEquals("4321-1234",account.getAccountNo());
    }

    @Test(expected = MinimumBalanceException.class)
    public void minimumBalanceException() throws MinimumBalanceException, InvalidAccountNumberException {
        Account account = new Account("5438-9870", 199);
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void invalidAccountNumberException() throws MinimumBalanceException, InvalidAccountNumberException {
        new Account("12",9000);
    }
}
