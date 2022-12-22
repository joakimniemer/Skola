public class IncrementAndDecrement {
    public static void main(String[] args) {
        
        int x = 10;
        int y = ++x; //Resultatet blir olika beroende på om man skriver ++x; eller x++;

        System.out.println(x);
        System.out.println(y);
    }
}
