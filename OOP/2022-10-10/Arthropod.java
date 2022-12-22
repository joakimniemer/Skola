import java.util.ArrayList;
import java.util.List;

public class Arthropod extends Animals {

    private List<String> lifeState;

    public Arthropod(String name, List<String> states, boolean canfly, boolean canswim, String sound) {
        super(name, canfly, canswim, sound);
        this.lifeState = states;

    }

    public List<String> getLifeStates() {
        return this.lifeState;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(getName() + " låter " + sound());

        if (canFly()) {
            build.append(" och kan flyga.");
        }
        if (canSwim()) {
            build.append(" och kan simma.");
        }

        String finalString = build.toString();
        return finalString;
    }
}
