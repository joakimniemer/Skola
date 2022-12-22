public class Animals {

    private String name;
    private boolean canFly;
    private boolean canSwim;
    private String sound;

    protected Animals(String name, boolean canFly, boolean canSwim, String sound) {
        this.name = name;
        this.canFly = canFly;
        this.canSwim = canSwim;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName();
    }

    public boolean canFly() {
        return canFly;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String sound() {
        return sound;
    }

}
