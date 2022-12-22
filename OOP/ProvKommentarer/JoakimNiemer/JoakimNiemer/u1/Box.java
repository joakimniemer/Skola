import java.util.Comparator;

public class Box implements Comparable<Box> {

    private final double length;
    private final double width;
    private final double heigth;

    Box(double length, double width, double heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    Box() {
        this.length = 1;
        this.width = 1;
        this.heigth = 1;
    }

    @Override
    public int compareTo(Box b) {
        Comparator<Box> comp = Comparator.comparing(Box::getLength)
                .thenComparing(Box::getWidth)
                .thenComparing(Box::getHeigth);

        return comp.compare(this, b);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(heigth);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Box other = (Box) obj;
        if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
            return false;
        if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
            return false;
        if (Double.doubleToLongBits(heigth) != Double.doubleToLongBits(other.heigth))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%.2f, %.2f, %.2f%n", this.length, this.width, this.heigth);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }
}

// din toString följer inte spec
// poäng: 10 - 1 = 9p
