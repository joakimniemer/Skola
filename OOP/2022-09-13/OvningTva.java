import java.util.Scanner;

public class OvningTva {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in rektangelns bredd");
        int bredd = scanner.nextInt();
        System.out.println("Skriv in rektangelns höjd");
        int hojd = scanner.nextInt();
        
        
        int omkrets = 2*bredd + 2*hojd;
        int area =  bredd * hojd;


        System.out.printf("Rektangelns omkrets är %d.%nRektangelns area är %d.%n", omkrets, area);
        if(area > 1000){
            System.out.println("Rektangeln är jättestor");
        }


        scanner.close();
    }
}
