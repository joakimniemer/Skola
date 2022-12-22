public class IfDemo {
    public static void main(String[] args) {
        
        int a, b, c;

        a = 2;
        b = 3;

        if (a<b) System.out.println("a is less then b");

        if (a==b) System.out.println("you won't see this");
        System.out.println();

        c = a - b;

        System.out.println("c contains -1");
        if (c >= 0) System.out.println("c is non-negativte");
        if (c < 0) System.out.println("c is negativte");
    
        c = b - a;

        System.out.println();
    
        System.out.println("c contains 1");
        if (c >= 0) System.out.println("c is non-negativte");
        if (c < 0) System.out.println("c is negativte");
    
    
    }
}
