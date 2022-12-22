public class IceCream {

    private int antalKulor;
    private String smak;


    public IceCream(int antalKulor, String smak) {
        this.antalKulor = antalKulor;
        this.smak = smak;
    }


    public IceCream(int antalKulor) {
        this.antalKulor = antalKulor;
        this.smak = "choklad";
    }

    public int getAntalKulor() {
        return antalKulor;
    }

    public void setAntalKulor(int antalKulor) {
        this.antalKulor = antalKulor;
    }

    public String getSmak() {
        return smak;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public String toString() {
        return String.format("Du har valt %d kulor med %ssmak.",
                getAntalKulor(), getSmak());
    }

}
