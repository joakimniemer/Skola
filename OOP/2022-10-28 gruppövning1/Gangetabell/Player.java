package Gangetabell;

public class Player {
    private String name;
    private double highScore;
    private int point;
    private int roundsPlayed;

    public Player(String name) {
        this.name = name;
        this.highScore = 100000.0;
        this.roundsPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public double getHigsccore() {
        return highScore;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setHighScore(double time) {
        if (time < highScore) {
            this.highScore = time;
        }
    }

    public String toString() {
        return String.format("%s's highscore är: %.2f", name, highScore);
    }

}