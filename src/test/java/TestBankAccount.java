import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {
    @Test
    public void shouldReturnCorrectBalance() {
        BankAccount account = new BankAccount(100);
        assertEquals(100, account.getBalance());
    }
}
