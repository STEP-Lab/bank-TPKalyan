import com.thoughtworks.AccountNumber;
import com.thoughtworks.InvalidAccountNumberException;
import org.junit.Test;

public class AccountNumberTest {

    @Test(expected = InvalidAccountNumberException.class)
    public void checkAccountNumberValidityIfItDosentContainIphen()throws InvalidAccountNumberException {
        new AccountNumber("1220384");
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void checkAccountNumberValidityIfItContainNumbersMoreThan8()throws InvalidAccountNumberException {
        new AccountNumber("1229-090384");
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void checkAccountNumberValdityIfItConsistsOfAlphabets() throws InvalidAccountNumberException {
        new AccountNumber("abcd");
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void checkAccountNumberValdityIfAccountNumberConsistsOfSymbols() throws InvalidAccountNumberException {
        new AccountNumber("123-4213");
    }

    @Test(expected = InvalidAccountNumberException.class)
    public void checkAccountNumberValdityIfAccountNumberConsistsOfTwoOrMoreIphens() throws InvalidAccountNumberException {
        new AccountNumber("123---------4213");
    }

}
