//Lab Seven Task 2
public class Shape {

    // Rectangle area method
    static void area(int length, int width) {
        System.out.println("Area of the rectangle: " + (length * width));
    }

    // Circle area method
    static void area(int radius) {
        System.out.println("Area of the circle: " + (3.14159 * radius * radius));
    }

    public static void main(String[] args) {

        System.out.println("Calculating Circle Area");
        area(4); // radius = 4

        System.out.println("\nCalculating Rectangle Area");
        area(4, 8); // length = 4, width = 8
    }
}
