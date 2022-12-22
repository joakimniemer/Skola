import java.util.Comparator;

final public class Computer implements Comparable<Computer> {
                                            // <Computer> !!!!!!!

    private final String name;
    private final double cpu;
    private final int ram;
    private final int hDrive;

    Computer(String name, double cpu, int ram, int hDrive) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hDrive = hDrive;
    }

    public String getName() {
        return name;
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
    public String toString() {
        return String.format("Processor: %.1fGHz, RAM: %dMB, Hard Driver: %dMB", cpu, ram, hDrive);
    }

    @Override
    public int compareTo(Computer o) {
        Comparator<Computer> comp = Comparator.comparing(Computer::getCpu)
        .thenComparing(Computer::getRam)
        .thenComparing(Computer::gethDrive);

        return comp.compare(this, o);
    }

}
