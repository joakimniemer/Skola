public class LattOvningSex {
    public static void main(String[] args) {
        Measurement m1 = new Measurement(10, "mm/s");

        int measureOne;
        int measureTwo;

        measureOne = -2;
        measureTwo = 5;

        if (m1.isNegative(measureOne) || m1.isNegative(measureTwo)) {

            if (measureOne < measureTwo) {
                System.out.println("This measurement is negative.");
            } else {
                System.out.println("This measurement is negative.");
            }
        } else {
            if (measureOne < measureTwo) {
                System.out.println(measureOne);
            } else {
                System.out.println(measureTwo);
            }
        }
    }

}
