public class uu2 {
    public static void main(String[] args) {

        IceCream2 ice = new IceCream2(IceCream2.Holder.CUP);
        IceCreamScoop2 f1 = new IceCreamScoop2("Chocolate", 100);
        IceCreamScoop2 f2 = new IceCreamScoop2("Vanilla", 150);
        IceCreamScoop2 f3 = new IceCreamScoop2("Pear", 125);

        ice.addScoop(f1);
        ice.addScoop(f2);
        ice.addScoop(f3);

        System.out.println(ice);

    }
}
