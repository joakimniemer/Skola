public class Person {
    public String forNamn;
    public String efterNamn;
    public int alder;

    public Person(String forNamn, String efterNamn, int alder) {
        this.forNamn = forNamn;
        this.efterNamn = efterNamn;
        this.alder = alder;
    }

    public String toString(){
        return String.format("Personen heter %s %s och är %d år gammal", forNamn, efterNamn, alder);
    }
}
