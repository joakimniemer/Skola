import java.util.concurrent.ThreadLocalRandom;

public class LoadedDie implements GameDie {

    public int roll() {

        int value = 0;
        double randomNumber = ThreadLocalRandom.current().nextInt(100) + 1;
        if (randomNumber < 33.4) {
            value = 6;
        } else if (randomNumber > 33.4 && randomNumber <= 46.72) {
            value = 1;
        } else if (randomNumber > 46.72 && randomNumber <= 60.04) {
            value = 2;
        } else if (randomNumber > 60.04 && randomNumber <= 73.36) {
            value = 3;
        } else if (randomNumber > 73.36 && randomNumber <= 86.68) {
            value = 4;
        } else if (randomNumber > 86.68 && randomNumber <= 100) {
            value = 5;
        }
        return value;
    }

    public String getDescription() {
        return "Supertärningen";
    }

    public String getName(){
        return "LoadedDie (1)";
    }
    

}
