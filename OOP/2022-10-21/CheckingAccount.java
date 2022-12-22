public class CheckingAccount extends BankAccount {

    private int fee = 10;

    public CheckingAccount(String accountNo, double accountBalance) {
        super(accountNo, accountBalance);
    }

    public void serviceFee() {
        withdraw(fee);
    }

    @Override
    public String toString() {
        return String.format("Kontonummer: %s har en service avgift på %d kr och innehar %.2f kr.",
                super.getAccountNo(), fee, super.getAccountBalance());
    }

}
