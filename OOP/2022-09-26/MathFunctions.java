public class MathFunctions {

    private double valueOne;
    private double valueTwo;
    private double maxValue;
    private double minValue;
    private double medianValue;

    public double maxValueDouble(double valueOne, double valueTwo) {
        if (valueOne > valueTwo){
            this.maxValue = valueOne;
        } else {
            this.maxValue = valueTwo;
        }
        return maxValue;
    }

    public double minValueDouble(double valueOne, double valueTwo){
        if (valueOne < valueTwo){
            this.minValue = valueOne;
        } else {
            this.minValue = valueTwo;
        }
        return minValue;
    }

    public double medianValueDouble ( double valueOne, double valueTwo) {

        this.medianValue = (valueOne + valueTwo) / 2;
        return medianValue;
    }

}
