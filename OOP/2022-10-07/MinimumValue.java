public class MinimumValue implements Operation {

    public int operation(int[] values) {
        int minValue = Integer.MAX_VALUE;

        for (int min : values) {
            if (min < minValue) {
                minValue = min;
            }
        }
        return minValue;
    }

    public String getName() {
        return "minimum";
    }
}
