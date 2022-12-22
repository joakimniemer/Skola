public class OvningTre {

    public static int imBadYouKnowIt(int value) {
        Integer[] arr = { Integer.valueOf(0), null, Integer.valueOf(2) };
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {

        try {
            imBadYouKnowIt(5);
        }

        catch (ArithmeticException ex) {
            System.err.println("ArtihmeticException " + ex.getClass().getName() + ex.getStackTrace());
        }

        catch (NullPointerException ex1) {
            System.err.println("NullPointerException " + ex1.getClass().getName());
        }

        catch (ArrayIndexOutOfBoundsException ex2) {
            System.err.println("ArrayIndexOutOfBoundsException " + ex2.getClass().getName());
        }

    }
}
