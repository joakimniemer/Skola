public class Circle extends Shape {

    private int radie;

    public Circle(int radie) {
        super("Circle");
        this.radie = radie;
    }

    public String toString(){
        return String.format("%s %d", getName(), radie);
    }

}
