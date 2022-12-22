public class LattInterfaceOvningEtt {

    public static int minimum(int[] values) {
        int minValue = Integer.MAX_VALUE;

        for (int min : values) {
            if (min < minValue) {
                minValue = min;
            }
        }
        return minValue;
    }

    public static int maximum(int[] values) {
        int maxValue = Integer.MIN_VALUE;

        for (int max : values) {
            if (max > maxValue) {
                maxValue = max;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] values = { 100, 2, -3, 4 };
        System.out.println("min: " + minimum(values));
        System.out.println("min: " + maximum(values));
    }
}