public abstract class BankAccount {

    private String accountNo;
    private double accountBalance;

    public BankAccount(String accountNo, double accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    public String toString() {
        return String.format("Kontonummer: %s innehar %.2f kr.", accountNo, accountBalance);
    }

}
