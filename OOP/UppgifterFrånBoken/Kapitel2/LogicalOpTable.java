public class LogicalOpTable {
    public static void main(String[] args) {

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        boolean p = true;
        boolean q = true;
        if (p == true & q == true)
            System.out.print(1 + "\t" + 1 + "\t");// true = 1, false = 0
        if (p == true & q == true)
            System.out.print(1 + "\t" + 1 + "\t");// true = 1, false = 0
        if (p == true & q == true)
            System.out.println(0 + "\t" + 0);// true = 1, false = 0

        p = true;
        q = false;
        if (p == true & q == false)
            System.out.print(1 + "\t" + 0 + "\t");
        if (p == true & q == false)
            System.out.print(0 + "\t" + 1 + "\t");
        if (p == true & q == false)
            System.out.println(1 + "\t" + 0);



      //  System.err.println("hdhdhd" + ((p|q) ? "1" : "0"));   //Hampus förklaring om hur man kan ändra värdet på false/true  til 1:0
 
        p = false;
        q = true;
        if (p == false & q == true)
            System.out.print(0 + "\t" + 1 + "\t");
        if (p == false & q == true)
            System.out.print(0 + "\t" + 1 + "\t");
        if (p == false & q == true)
            System.out.println(1 + "\t" + 1);

        p = false;
        q = false;
        if (p == false & q == false)
            System.out.print(0 + "\t" + 0 + "\t");
        if (p == false & q == false)
            System.out.print(0 + "\t" + 0 + "\t");
        if (p == false & q == false)
            System.out.println(0 + "\t" + 1);

    }
}
