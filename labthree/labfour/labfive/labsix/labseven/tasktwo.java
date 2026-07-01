//Lab Seven Task 1
public class Calculator {

    // Method to add two integers
    static int addition(int a, int b) {
        return a + b;
    }

    // Method to add two decimal numbers
    static double addition(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    static int addition(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Using the first method");
        System.out.println(addition(3, 3));

        System.out.println("\nUsing the second method");
        System.out.println(addition(2.3, 4.5));

        System.out.println("\nUsing the third method");
        System.out.println(addition(4, 9, 23));
    }
}
