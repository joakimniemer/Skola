import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Locale;

public class OvningTre {
    public static void main(String[] args) {

        Locale swe = Locale.forLanguageTag("sv-SE");
        Locale schw = new Locale("de", "CH");
        LocalDate start = LocalDate.of(2023, 01, 01);

        DateFormatSymbols dfsSwe = new DateFormatSymbols(swe);
        DateFormatSymbols dfsSchw = new DateFormatSymbols(schw);

        for (String string : dfsSwe.getMonths()) {
            System.out.println(string);
        }

        for (String string : dfsSchw.getMonths()) {
            System.out.println(string);
        }

    }
}
