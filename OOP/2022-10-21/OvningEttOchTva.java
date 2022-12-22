public class OvningEttOchTva {

    private static String printAccountDetails(BankAccount ba) {
        return ba.toString();
    }

    @SuppressWarnings ({"java:S106"})
    public static void main(String[] args) {

        // BankAccount ba = new BankAccount("1337", 10000);
        // System.out.println(printAccountDetails(ba));

        SavingsAccount sa = new SavingsAccount("1338", 10000);
        sa.addIntrest();
        System.out.println(printAccountDetails(sa));

        CheckingAccount ca = new CheckingAccount("1339", 10000);
        ca.serviceFee();
        System.out.println(printAccountDetails(ca));

    }
}
