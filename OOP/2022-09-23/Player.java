public class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void guessedRigth() {
        this.points += 3;
    }
    public void guessedWrong() {
        this.points--;
    }
    

}
