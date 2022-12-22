public class GalToLitTable {
    public static void main(String[] args) {

        double gallon, liter;
        int count;

        liter = 10; 

        count = 0;

        for (gallon = 1; gallon <= 100; gallon++) {
            liter = gallon * 3.7854;
            System.out.println(gallon + " gallon är " + liter + " liter");

            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }

        }

        System.out.println(gallon); 
        System.out.println(liter); 
        
    }
}
