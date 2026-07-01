// Lab Ten Task 1
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class ShapeAbstraction {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.area();
        rectangle.area();
    }
}
