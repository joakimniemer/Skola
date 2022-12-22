import java.util.ArrayList;
import java.util.List;

public class OvningTre {

    public static void main(String[] args) {

        String word = "hej på dig";

        // tar emot en string och skriver ut den som en char-array
        char[] charArray = fromString(word);
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        // tar emot en char-array, gör om den till char-list skriver ut den
        List<Character> charList = fromArray(charArray);
        System.out.println(charList);


        //tar emot en char-list och skriver ut den som string igen
        String listToString = fromList(charList);
        System.out.println(listToString);

    }

    public static char[] fromString(String string) {
        char[] charArray = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }

    public static List<Character> fromArray(char[] string) {
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < string.length; i++) {
            charList.add(string[i]);
        }
        return charList;
    }

    public static String fromList(List<Character> string) {
        StringBuilder build = new StringBuilder();

        for (Character k : string) {
            build.append(k);
        }
        String listToString = build.toString();
        return listToString;
    }

}
