public class InchToMeter {
    public static void main(String[] args) {

        double meter;

        int count, inch;
        

        count = 0;

        for (inch = 1; inch <= 144; inch++) {
            meter = inch / 39.37;
            System.out.println(inch + " inch är " + meter + " meter");

            count++;

            if (count == 12) {
                System.out.println();
                count = 0;

            }

        }
       
    }
}
