import java.util.concurrent.ThreadLocalRandom;

public class RegularD6 implements GameDie {

    
    public int roll() {
        return ThreadLocalRandom.current().nextInt(6) + 1;
    }

    
    public String getDescription() {
        return "tärningen";
    }

    public String getName(){
        return "RegularD6 (0)";
    }
    
}
