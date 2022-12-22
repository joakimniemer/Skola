import java.util.ArrayList;
import java.util.List;

final class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public static List<Person> generateAllCombinations(List<String> firstNames, List<String> lastNames) {
        List<Person> fullName = new ArrayList<>();

        String newName;
        for (String fname : firstNames) {
            for (String lname : lastNames) {
                Person person = new Person(fname, lname);
                fullName.add(person);
            }
        }
        return fullName;
    }

}
