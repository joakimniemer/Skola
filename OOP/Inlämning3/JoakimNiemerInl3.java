import java.util.Scanner;

public class JoakimNiemerInl3 {
    public static void main(String[] args) {

        Spargris sg = new Spargris();
        Scanner scan = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Vilket mynt vill du spara?");
            userInput = scan.nextInt();
            sg.addCoin(userInput);

        } while (userInput != 0);

        System.out.printf("Du har sparat %d mynt till ett totalt värde av %d kronor.%n",
                sg.getNumberOfCoins(), sg.getValueOfAllCoins());

        scan.close();
    }
}