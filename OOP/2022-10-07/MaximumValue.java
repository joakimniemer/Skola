public class MaximumValue implements Operation {

    public int operation(int[] values) {
        int maxValue = Integer.MIN_VALUE;

        for (int max : values) {
            if (max > maxValue) {
                maxValue = max;
            }
        }
        return maxValue;
    }

    public String getName() {
        return "maximum";
    }

}
