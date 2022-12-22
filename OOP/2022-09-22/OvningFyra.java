import java.util.Scanner;

public class OvningFyra {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in en persons namn, efternamn och ålder: ");
        Person person1 = new Person(scan.next(), scan.next(), scan.nextInt());

        System.out.println(person1);

        scan.close();
    }
}
