public class joinTest {
    public static void main(String[] args) {
        

        String fnamn = "Joakim ";
        String enamn = "Niemer";
        String fulname = String.join(" ", fnamn, enamn);
    
        System.out.println(fulname);

        String fulname2 = String.join("%", fulname, "hej");

        System.out.println(fulname2);
    }
}
