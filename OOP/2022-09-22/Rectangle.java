public class Rectangle {
    public double bredd;
    public double hojd;

    // public Rectangle() {
    // this.bredd = 1;
    // this.hojd = 1;
    // }

    public Rectangle() {
        this(1, 1); // kolla slid "egendefinerad konstukror" för att kanske hitta lösningen?

    }

    public Rectangle(double bredd, double hojd) {
        this.bredd = bredd;
        this.hojd = hojd;
    }

    public String toString() { // Hur funkar denna? Man behöver inte kalla på metoden i OvningEtt?? Bara
                               // System.out.println(rec1); ??
        return String.format("Rectangelns bredd och höjd är %.2f och %.2f", bredd, hojd);
    }
}