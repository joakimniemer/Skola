import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private String fname;
    private String enamn;
    private String birthYear;

    public Person(String fname, String enamn, String birthYear) {
        this.fname = fname;
        this.enamn = enamn;
        this.birthYear = birthYear;
    }

    public Person(Person person){
        this.fname = person.fname;
        this.enamn = person.enamn;
        this.birthYear = person.birthYear;
    }

    public String getFname() {
        return fname;
    }

    public String getEnamn() {
        return enamn;
    }

    public String getBirthYear() {
        return birthYear;
    }

    @Override
    public int compareTo(Person o) {
        Comparator<Person> comp = Comparator.comparing(Person::getEnamn);
        return comp.compare(this, o);
    }

    public String toString() {
        return String.format("%s %s %s", fname, enamn, birthYear);
    }

    public boolean equals(Person p) {
        if (this == p) {
            return true;
        }

        if (!(p instanceof Person)) {
            return false;
        }

        //funkar detta verkligen??
        // Person abc = (Person) p;

        return Objects.equals(fname, p.fname)
                && Objects.equals(enamn, p.enamn);
                // && Objects.equals(birthYear, abc.birthYear);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((fname == null) ? 0 : fname.hashCode());
        result = prime * result
                + ((enamn == null) ? 0 : enamn.hashCode());
        result = prime * result
                + ((birthYear == null) ? 0 : birthYear.hashCode());

        return result;
    }

}
