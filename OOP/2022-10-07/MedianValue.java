public class MedianValue implements Operation {

    public int operation(int[] values) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            counter++;
        }
        int median = sum / counter;
        return median;
    }

    public String getName() {
        return "median";
    }
}
