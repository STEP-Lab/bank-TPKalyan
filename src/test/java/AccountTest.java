import com.thoughtworks.Account;
import com.thoughtworks.MinimumBalanceException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test

    public void getBalance() throws MinimumBalanceException {
        Account account = new Account("1234", 1024);
        assertEquals(1024,account.getBalance());
    }

    @Test
    public void getAccountNo() throws MinimumBalanceException {
        Account account = new Account("4321", 5000);
        assertEquals("4321",account.getAccountNo());
    }

    @Test(expected = MinimumBalanceException.class)
    public void minimumBalanceException() throws MinimumBalanceException {
        new Account("543",199);
    }
}
