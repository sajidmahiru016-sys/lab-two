//Lab Eight Task 2
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Creating objects of each class
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        
        // Calling the overridden methods
        shape.draw();
        circle.draw();
        rectangle.draw();
    }
}
