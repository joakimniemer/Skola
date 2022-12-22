public class OvningTva {
    public static void main(String[] args) {


        double radius = 12.3;
        // code goes here, use StrictMath.PI
        
        double pi = StrictMath.PI;
        double area = radius * radius * pi;
        double circumference = (radius * 2) * pi;




        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", + area);  //printf har inbyggda egenskaper som gör att den letar efter %.2f./n


    }
}



