public class Statistics {

    private String playerName;
    private int timesPlayed;
    private int leastNumberOfGuesses = 0;
    private int mostNumberOfGuesses = 0;
    private int guessCounter;

    public Statistics(String playerName) {
        this.playerName = playerName;
        this.timesPlayed = 0;
        this.leastNumberOfGuesses = 0;
        this.mostNumberOfGuesses = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    public void setTimesPlayed(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }

    public int getLeastNumberOfGuesses() {
        return leastNumberOfGuesses;
    }

    public void updateLeastAndMostNumberOfGuesses() {
        if (getLeastNumberOfGuesses() == 0) {
            setLeastNumberOfGuesses(getGuessCounter());
        } else if (getGuessCounter() < getLeastNumberOfGuesses()) {
            setLeastNumberOfGuesses(getGuessCounter());
        }
        if (getGuessCounter() > getMostNumberOfGuesses()) {
            setMostNumberOfGuesses(getGuessCounter());
        }
    }

    public void setLeastNumberOfGuesses(int leastNumberOfGuesses) {
        this.leastNumberOfGuesses = leastNumberOfGuesses;
    }

    public void setMostNumberOfGuesses(int mostNumberOfGuesses) {
        this.mostNumberOfGuesses = mostNumberOfGuesses;
    }

    public int getMostNumberOfGuesses() {
        return mostNumberOfGuesses;
    }

    public int getGuessCounter() {
        return this.guessCounter;
    }

    public void resetGuessCounter() {
        this.guessCounter = 0;
    }

    public void guessCounterAdd() {
        this.guessCounter++;
    }

    public void timesPlayedAdd() {
        this.timesPlayed++;
    }

    public String toString() {
        return String.format(
                "%nDu har spelat klart.%n%s, du har spelat %d omgångar,%nSom snabbast klarade du det på %d gissning. Som sämst klarade du det på %d gissningar. Vill du spela igen? (ja/nej)%n",
                getPlayerName(), getTimesPlayed(), getLeastNumberOfGuesses(), getMostNumberOfGuesses());
    }

    public void rigthAnswerReaction() {
        System.out.println("Korrekt!");
        this.guessCounterAdd();
        this.updateLeastAndMostNumberOfGuesses();
        this.resetGuessCounter();
    }

}
