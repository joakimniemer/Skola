public class OvningSex {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + b + " is a magic number."); //Den läser från vänster till höger och hinner därför räkna 1+2 innan det blir en string.
        System.out.println("The magic number is " + a + b); //Den läser från vänster till höger och eftersom det börjar med en string så bli a och b omvandlade till stings
                                                            // Behöver paranteser för att lösa detta.
        System.out.println("Or maybe it is " + (a + b));    // Hör har vi paranteserna och då skrivs strinngen ut och sedan räknas a+b ut.
    }
}