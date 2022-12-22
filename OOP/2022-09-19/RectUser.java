

public class RectUser {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setColor("blue");
        r1.setHeight(10);
        r1.setWidth(15);

        r1.print();

        Rectangle r2 = new Rectangle();
        r2.setWidth(9);
        r2.setHeight(9);
        r2.setColor("red");

        r2.print();

        System.out.printf("r1s area is %d%n", r1.area());

        int res = r1.getStuff(false);
        System.out.println(res);
    }
}