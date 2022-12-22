public class App {
    public static void main(String[] args) {

        IceCream ice = new IceCream(IceCream.Holder.WAFFLE);
        IceCreamScoop scoop1 = new IceCreamScoop("chocolate", 100);
        IceCreamScoop scoop2 = new IceCreamScoop("vanilla", 155);
        IceCreamScoop scoop3 = new IceCreamScoop("banana", 125);
        ice.addScoop(scoop1);
        ice.addScoop(scoop2);
        ice.addScoop(scoop3);

        System.out.println(ice);

    }
}
