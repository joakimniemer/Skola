import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class OvningEtt {
    public static void main(String[] args) {

        System.out.println(randomName());
        System.out.println(randomName());
        System.out.println(randomName());
        System.out.println(randomName());
        System.out.println(randomName());

    }

    public static String randomName() {

        List<String> firstNames = List.of("Nisse ", "Bosse ", "Lena ", "Leyla ");
        List<String> lastNames = List.of("Eriksson", "Smith", "Patel", "Rojas", "Lamm");

        return firstNames.get(ThreadLocalRandom.current().nextInt(4))
                + lastNames.get(ThreadLocalRandom.current().nextInt(5));
    }

}
