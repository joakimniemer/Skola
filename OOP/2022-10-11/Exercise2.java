import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {

        List<String> objects = List.of("A", "B", "C", "D");

        List<String> receive = everyOther(objects);
        System.out.println(receive);
        for (String letter : receive) {
            System.out.println(letter);
        }

    }

    public static List<String> everyOther(List<String> list) {
        List<String> everyOtherElement = new ArrayList<>();

        for (int i = 0; i < list.size(); i += 2) {
            everyOtherElement.add(list.get(i));
        }
        return everyOtherElement;
    }

}
