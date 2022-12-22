package Gangetabell;

import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class Engine {

    private int randomNumberOne;
    private int randomNumberTwo;
    private double time;

    public void playGame() {
        getRandomNumber();
    }

    public void getRandomNumber() {
        randomNumberOne = 5 + ThreadLocalRandom.current().nextInt(10);
        randomNumberTwo = 5 + ThreadLocalRandom.current().nextInt(10);
    }

    public void startTimeEndTime(double time) {
        this.time = time;
    }

    public int getAnswer() {
        return randomNumberOne * randomNumberTwo;
    }

    public int getRandomNumberOne() {
        return randomNumberOne;
    }

    public int getRandomNumberTwo() {
        return randomNumberTwo;
    }

    public double getTime() {
        return time;
    }

}
