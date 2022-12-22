import java.time.LocalDate;

public class OvningTva {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate plusOneMonth = LocalDate.of(today.getYear(), today.getMonthValue()+1, today.getDayOfMonth());
        LocalDate betterPlusOneMonth = today.plusMonths(1); //Bättre sätt

        System.out.println(today);
        System.out.println(plusOneMonth);
        System.out.println(betterPlusOneMonth);
        
    }

}

