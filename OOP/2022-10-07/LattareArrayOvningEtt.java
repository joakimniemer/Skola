
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LattareArrayOvningEtt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numberArray = new int[10];
        int median = 0;
        

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Skriv in ett heltal:");    
            numberArray[i] = scan.nextInt();
            median += numberArray[i];
        }
        median = median / 2;

        System.out.println("Medelvärdet för dessa tal är: " + median);


        List<Integer> integerList = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Skriv in ett heltal:");  
            integerList.add(scan.nextInt());
        }

        int medianList = 0;
        for (int value : integerList){
            medianList += value;
        }

        medianList = medianList / 2;
        System.out.println(medianList);

    }
}
