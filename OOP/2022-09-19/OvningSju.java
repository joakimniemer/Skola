public class OvningSju {

    public static Car createCar(String test, String brand, int produceYear, int weigth, int effect) { //dessa behöver inte vara kopplade till variablnarna i klassen Car?
        Car car = new Car();
        car.setReg(test);  //Det funkar att döpa dom till vad som helst? Dom är lokala i denna metoden??
        car.setBrand(brand);
        car.setProduceYear(produceYear);
        car.setWeigth(weigth);
        car.setEffect(effect);
        return car;
    }

    public static void main(String[] args) {

        Car car1 = createCar("XYZ 12A", "Ford S-Max", 2019, 2401, 160);
        Car car2 = createCar("ANK 312", "Skruttomobil", 1927, 812, 97);
      
       System.out.println(car1);
       System.out.println(car2);

    }
}
