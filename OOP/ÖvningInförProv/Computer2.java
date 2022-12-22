import java.util.Comparator;

public class Computer2 implements Comparable<Computer2> {

    private final double cpu;
    private final int ram;
    private final int hDrive;

    Computer2(double cpu, int ram, int hDrive) {
        this.cpu = cpu;
        this.ram = ram;
        this.hDrive = hDrive;
    }

    public double getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int gethDrive() {
        return hDrive;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(cpu);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ram;
        result = prime * result + hDrive;
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
        Computer2 other = (Computer2) obj;
        if (Double.doubleToLongBits(cpu) != Double.doubleToLongBits(other.cpu))
            return false;
        if (ram != other.ram)
            return false;
        if (hDrive != other.hDrive)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return String.format("CPU: %.1f, RAM: %d, Driver: %d%n", this.cpu, this.ram, this.hDrive);
    }

    @Override
    public int compareTo(Computer2 o) {
        Comparator<Computer2> comp = Comparator.comparing(Computer2::getCpu)
                .thenComparing(Computer2::getRam)
                .thenComparing(Computer2::gethDrive);
        return comp.compare(this, o);
    }

}
