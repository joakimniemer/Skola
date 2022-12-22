import java.util.Random;

public class OvningFem {
    public static void main(String[] args) {

        Random rand = new Random();

        int slump = 0;
        int counter = 0;

        while (slump != 123) {
            slump = rand.nextInt(1000) + 1;
            counter++;
        }
        System.out.printf("Det tog %d gånger innan slumpen gav talet 123.", counter);

    }

}
