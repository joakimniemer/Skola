import java.util.concurrent.ThreadLocalRandom;

public class RegularD12 implements GameDie {

    
    public int roll() {
        return ThreadLocalRandom.current().nextInt(12) + 1;
    }

    
    public String getDescription() {
        return "den 12 sidiga tärningen";
    }

    public String getName(){
        return "RegularD12 (2)";
    }
    
    
}
