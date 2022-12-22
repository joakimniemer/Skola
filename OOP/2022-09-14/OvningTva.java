import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in en höjd i meter:");
        double heigth = scan.nextDouble(); // glöm inte använda typ av variable och läs felmeddelanden!
        int counter = 0;
    

        for (double i = heigth; i >= 0.01; i = i * 0.7){
            counter++;
           // counter = counter++; vad säger engeltigen denna??
            
        }

        System.out.printf("Bollen studsar %d gånger.", counter);

        scan.close();
    }
}
