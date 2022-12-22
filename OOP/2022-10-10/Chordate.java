public class Chordate extends Animals {
    private int tailLength;

    public Chordate(String name, Boolean canfly, Boolean canswim, String sound, int tailLength) {
        super(name, canfly, canswim, sound);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return this.tailLength;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append(getName() + " låter " + sound());

        if (canFly()) {
            build.append(" och kan flyga.");
        }
        if (canSwim()) {
            build.append(" och kan simma.");
        }

        String finalString = build.toString();
        return finalString;
    }

}
