import java.util.concurrent.ThreadLocalRandom;

public class GameDie {

    private int numberOfSides;
    private int diceRoll;
    private int rollCounter;
    private int totaltValueOfRolls;

    public GameDie() {
        numberOfSides = 6;
    }

    public GameDie(int sides) {
        if (sides % 2 != 0) {
            this.numberOfSides = sides + 1;
        } else {
            this.numberOfSides = sides;
        }
    }

    public int generateDiceRoll() {
        this.diceRoll = 1 + ThreadLocalRandom.current().nextInt(getNumberOfSides());
        this. rollCounter++;
        this.totaltValueOfRolls += this.diceRoll;
        System.out.println("Du slog en " + getDiceRoll());
        return this.diceRoll;
    }

    public double medianCounter() {
        return this.getTotalValueOfRolles()/this.rollCounter;
    }

    public void medianAndNumberOfRolles () {
        System.out.println("Tärningen slogs " + getRollCounter() + " gånger.");
        System.out.println("Medelvärdet av slagen blev " + medianCounter());
    }


    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public int getRollCounter() {
        return this.rollCounter;
    }

    public int getTotalValueOfRolles() {
        return this.totaltValueOfRolls;
    }

    public int getDiceRoll() {
        return this.diceRoll;
    }



}
