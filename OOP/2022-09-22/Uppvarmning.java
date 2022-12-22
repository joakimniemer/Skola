public class Uppvarmning {
    public static void main(String[] args) {
        Box box1 = new Box(10); // Här skapar vi ett objekt med hjälp av en klass som vi definerar med en
                                // konstruktor.
        Box box2 = new Box(10, 10, 10); // Samma här men med en annan konstruktor.
        System.out.printf("Box 1 volume is %d.%n", box1.getVolume());
        System.out.printf("Box 2 volume is %d.%n", box2.getVolume());
    }
}