import java.util.ArrayList;
import java.util.List;

public class OvningTva {
    public static void main(String[] args) {

        List<Shape> shape = new ArrayList<>();
        shape.add(new Triangle(5, 10));
        shape.add(new Triangle(15, 25));
        shape.add(new Circle(5));
        shape.add(new Circle(10));

        for (Shape k : shape) {
            System.out.println(k);
        }

    }
}
