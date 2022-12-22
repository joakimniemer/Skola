public class OvningTre {
    public static void main(String[] args) {

        
        float radius = (float)12.3; //Explicit? Man "lovar" programmet att denna omvandling är okej även fast det inte är enligt javas regler?
       // float radius = 12.3f; är ett annat alternativ                     
        // code goes here, use StrictMath.PI
        
        
        float area = (float)(radius * radius * StrictMath.PI);//detta värde är double, därför måste vi ändra tillbaka det till en float?
        float circumference = (float)(radius * 2 * StrictMath.PI); //detta värde är double, därför måste vi ändra tillbaka det till en float?




        System.out.printf("Omkretsen på cirkeln är %.2f.\n", circumference);
        System.out.printf("Arean på cirkeln är %.2f.\n", + area);
    



        
    }
}