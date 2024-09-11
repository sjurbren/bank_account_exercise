public class BankAccount {
    private double balance;
    private Ledger ledger;
    public BankAccount(double initialBalance, Ledger ledger) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
        this.ledger = ledger;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero");
        }
        this.balance += amount;
        ledger.deposit(amount);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance for withdrawal");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero");
        }
        this.balance -= amount;
        ledger.withdraw(amount);
    }

    public double getBalance() {
        return this.balance;
    }

    public void transfer(BankAccount target, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Transfer amount must be greater than zero");
        }
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance for transfer");
        }
        this.withdraw(amount);
        target.deposit(amount);
    }
}
