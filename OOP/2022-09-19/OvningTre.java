public class OvningTre {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setReg("ABC 123");
        car1.setBrand("Volvo");
        car1.setProduceYear(1998);
        car1.setWeigth(2050);
        car1.setEffect(170);

        System.out.printf("Car2 reg.nr is %s.\n", car1.getReg());
        System.out.printf("The brand is %s.\n", car1.getBrand());
        System.out.printf("It weiges %d kg.\n", car1.getWeigth());
        System.out.printf("Model year %d.\n", car1.getProduceYear());
        System.out.printf("The cars effect is %d.\n", car1.getEffect());

        System.out.println(" ");

        Car car2 = new Car();
        car2.setReg("HEJ 313");
        car2.setBrand("Skoda");
        car2.setProduceYear(2011);
        car2.setWeigth(2255);
        car2.setEffect(225);
        

        System.out.printf("Car2 reg.nr is %s.\n", car2.getReg());
        System.out.printf("The brand is %s.\n", car2.getBrand());
        System.out.printf("It weiges %d kg.\n", car2.getWeigth());
        System.out.printf("Model year %d.\n", car2.getProduceYear());
        System.out.printf("The cars effect is %d.\n", car2.getEffect());

    }
}
