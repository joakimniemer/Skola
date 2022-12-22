/**
 * A simple rectangle...
 * 
 */
public class Rectangle {
    private int width;
    private int height;
    private String color;

    /**
     * Set the height of the rectangle. Must be a positivt value.
     * 
     * @param height the positive height of the rectangle
     */
    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
        else {
            System.out.println("width must be positive");
        }
    }

    public void setColor(String color) {
        if (color.equals("blue") || color.equals("red")) {
            this.color = color;
        }
    }

    /**
     * Get the color.
     * @return the rectangles color.
     */
    public String getColor() {
        return color;
    }

    public void print() {
        System.out.printf("width: %d%n", width);
        System.out.printf("height: %d%n", height);
        System.out.printf("width: %s%n", color);
    }

    public int area() {
        return width * height;
    }

    public int getStuff(boolean value) {
        if (value) {
            return 122;
        }

        return 0;
    }
}