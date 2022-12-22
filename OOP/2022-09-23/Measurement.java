public class Measurement {
    private int value;
    private String unit;

    public Measurement(int value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        unit = unit;
    }

    public String toString() {
        return String.format("%d %s.\n", this.value, this.unit);
    }

    public boolean isNegative(int measure) {
        if (measure < 0) {
            return true;
        } else {
            return false;
        }
    }

}
