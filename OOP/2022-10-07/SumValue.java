public class SumValue implements Operation {
    
    public int operation(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public String getName() {
        return "sum";
    }
    

}
