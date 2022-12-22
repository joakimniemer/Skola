public class OvningTva {
    public static void main(String[] args) {

        Car car1 = new Car();   //type, namn, new, ?
        car1.setReg("ABC 123");
        car1.setBrand("Volvo"); //nu när det är metoder är det inte längre "=" lika med. Det är inom parantes istället.
        car1.setProduceYear(1995);
        car1.setWeigth(2050);
        car1.setEffect(170);

        Car car2 = new Car();
        car2.setReg("HEJ 313");
        car2.setBrand("Skoda");
        car2.setProduceYear(2011);
        car2.setWeigth(2255);
        car2.setEffect(225);

        car1.print();
        System.out.println("");
        car2.print();

    

    }
}
