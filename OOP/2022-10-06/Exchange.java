public class Exchange {

    private double rate;
    private String currancy;

    public Exchange() {
    }

    public Exchange(String currancy, double rate) {
        this.currancy = currancy;
        this.rate = rate;
    }

    public double getRate() {
        return this.rate;
    }

    public String getCurrancy() {
        return this.currancy;
    }

    public double exchangeCurrancy(double rateFrom, double rateTo, double amount) {
        double amountInEUR = amount / rateFrom;
        double toNewCurrancy = amountInEUR * rateTo;
        return toNewCurrancy;
    }

}
