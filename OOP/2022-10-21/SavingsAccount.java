public class SavingsAccount extends BankAccount {

    private double interest = 0.03;

    public SavingsAccount(String accountNo, double accountBalance) {
        super(accountNo, accountBalance);
    }

    public void addIntrest() {
        deposit(interest * getAccountBalance());
    }

    @Override
    public String toString() {
        return String.format("Kontonummer: %s har ränta på 3 procent och innehar %.2f kr.", super.getAccountNo(),
                super.getAccountBalance());
    }
}
