import java.util.ArrayList;
import java.util.List;

public class OvningTre {
    public static void main(String[] args) {

        // Bee
        List<String> biStates = new ArrayList<>();
        biStates.add("Ägg");
        biStates.add("Larv");
        biStates.add("Puppa");
        biStates.add("Imago");
        Arthropod bi = new Arthropod("Bi", biStates, true, false, "Beeeeeeee");

        // Krill
        List<String> krillStates = new ArrayList<>();
        biStates.add("Ägg");
        biStates.add("Nauplius");
        biStates.add("Vuxen");
        Arthropod krill = new Arthropod("Krill", krillStates, false, true, "BlubbBlubb");

        // Human
        List<String> humanStates = new ArrayList<>();
        humanStates.add("0cm");
        Chordate human = new Chordate("Människa", false, true, "hejhej", 0);

        // GlassFrogg
        List<String> glassFrogg = new ArrayList<>();
        glassFrogg.add("4mm");
        Chordate frog = new Chordate("Glassgroda", false, true, "quack", 2);

        // List of animals
        List<Animals> animals = new ArrayList<>();
        animals.add(bi);
        animals.add(krill);
        animals.add(human);
        animals.add(frog);

        // Loop for list of animals
        for (Animals i : animals) {
            System.out.println(i);
        }
    }
}
