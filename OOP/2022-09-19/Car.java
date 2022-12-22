import java.time.LocalDate;

public class Car {

    private String reg;
    private String brand;
    private int produceYear;
    private int weigth;
    private int effect;

    public void setReg(String reg) { // Detta är också metoder. Den skall inte returera något därför använder vi void
                                     // (den måste då vara void???)
        this.reg = reg; // vi säger sedan att den skall ta emot ett argument av typen String
    } // som skall lagras i "denna" variablen som heter reg.

    public String getReg() {
        return reg;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() { // En annan metod (getter) där vi inte skall ge den någon input och därför inte
                               // kan använda void
        return brand; // Här skall vi istället hämta ett värde och måste därför i metoder använda
                      // "return" och namnet på variablen.
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public int getEffect() {
        return effect;

    }

    public void print() { // print method

        System.out.printf("%s, reg %s får %d. Tjänstevikt %d och motoreffekt på %d.\n",
                brand, reg, produceYear, weigth, effect);
        if (isClassic()) {
            System.out.println("Detta är en veteranbil");
        } else {
            System.out.println("Detta är inte en veteranbil");
        }
    }

    public String toString() {
        if (isClassic()) {
            return String.format("%s, reg %s från %d. Tjänstevikt %d och motoreffekt på %d. Detta är en veteranbil.%n",
                    brand, reg, produceYear,
                    weigth, effect);
        } else {
            return String.format("%s, reg %s från %d. Tjänstevikt %d och motoreffekt på %d.%n", brand, reg, produceYear,
                    weigth, effect);
        }
    }

    public boolean isClassic() { // boolean method, typen av metod säger vad den skall returera.
        LocalDate lt = LocalDate.now();
        int yearOld = lt.getYear() - this.produceYear;
        if (yearOld >= 25) {
            return true;
        } else {
            return false;
        }

    }
}