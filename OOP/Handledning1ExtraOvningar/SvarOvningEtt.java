import java.util.Scanner;

public class SvarOvningEtt {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Mata in första talet: ");
        int talEtt = scan.nextInt();

        System.out.print("Mata in andra talet: ");
        int talTva = scan.nextInt();

        if (talEtt < talTva){
            for (int i = talEtt; i <= talTva; i++){
                System.out.print(i + " ");
            }
        } else {
            for (int k = talTva; k <= talEtt; k++){
                System.out.print(k + " ");
            }
        }
        System.out.println("");

        scan.close();

    }
}
