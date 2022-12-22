import java.io.IOException;

public class OvningSex {

    public static int countSubstrings(String substring, String text) throws IOException {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 2) {
                break;
            }
            if (text.substring(i, (i + 3)).equals("apa")) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        try {

            System.out.println(countSubstrings("apa",
                    "aaapapa"));

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}