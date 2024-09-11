import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class TestBankAccount {
    @Test
    public void shouldReturnCorrectBalance() {
        Ledger ledger = mock(Ledger.class);
        BankAccount account = new BankAccount(100, ledger);
        assertEquals(100, account.getBalance());
    }
}
