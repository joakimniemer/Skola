public class OvningFem {
    public static void main(String[] args) {
        byte a = 2;
        byte b = 3;
        byte c = (byte)(a * b); //Alternativt deklarerar vi c som en int istället. finns chansen att talet blir större än 127 eller mindre än -128 så bör int användas.
        System.out.println("Svar: " + c);
    }
}