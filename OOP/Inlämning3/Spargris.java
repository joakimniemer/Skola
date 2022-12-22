/*
 * A piggy bank for saving coins of value 1,2,5 or 10.
 */

public class Spargris {

    private int numberOfCoins;
    private int valueOfAllCoins;

    public Spargris() {
        this.numberOfCoins = 0;
        this.valueOfAllCoins = 0;
    }

    /*
     * Adding a coin. If the coin meet requirements of accaptedCoins, it will
     * add one coin to the piggy bank and add the value of the coin to
     * valueOfAllCoins.
     * 
     * @param coin the coin the user will try to put in.
     */
    public void addCoin(int coin) {
        if (acceptedCoins(coin)) {
            numberOfCoins++;
            valueOfAllCoins += coin;
        }
    }

    public boolean acceptedCoins(int coinDenomination) {
        if (coinDenomination == 1) {
            return true;
        } else if (coinDenomination == 2) {
            return true;
        } else if (coinDenomination == 5) {
            return true;
        } else if (coinDenomination == 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean acceptedCoinsImprovment(int coin) { //Kommentar/förbättringsförslag
        return coin == 1 || coin == 2 || coin == 5 || coin == 10;
    }

    public int getNumberOfCoins() {
        return this.numberOfCoins;
    }

    public int getValueOfAllCoins() {
        return this.valueOfAllCoins;
    }
}
