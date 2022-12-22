public class Secretlanguages {

    public String theRobberLanguage(String input) {
        String translate = "";

        for (int i = 0; i < input.length(); i++) {
            if (consonats(input.charAt(i))) {
                translate += input.charAt(i) + "o" + input.charAt(i);
            } else {
                translate += input.charAt(i);
            }
        }
        return translate;
    }

    public String allLanguage(String input) {
        String translate = "";
        int spaceChecker = 0;
        for (int i = 0; i < input.length(); i++) {

            if (consonats(input.charAt(i)) && spaceChecker == 0) {
                translate += input.charAt(i) + "all";
                spaceChecker++;
            } else {
                translate += input.charAt(i);
                if (input.charAt(i) == ' ') {
                    spaceChecker = 0;
                }
            }
        }
        return translate;
    }

    public boolean consonats(char input) {
        return input == 'b' || input == 'c' || input == 'd' || input == 'f' || input == 'g' || input == 'h'
                || input == 'j' || input == 'k' || input == 'l' || input == 'm' || input == 'n' || input == 'p'
                || input == 'q' || input == 'r' || input == 's' || input == 't' || input == 'v' || input == 'w'
                || input == 'x' || input == 'z';

    }

}