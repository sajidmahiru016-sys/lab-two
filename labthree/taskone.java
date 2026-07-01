//Lab Three Task 1
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        // Array to store even numbers
        int[] evenNumbers = new int[(end - start) / 2 + 1];
        int count = 0;

        // Using while loop to store even numbers
        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                count++;
            }
            i++;
        }

        // Using while loop to print
        System.out.println("Even numbers using while loop:");
        int j = 0;
        while (j < count) {
            System.out.print(evenNumbers[j] + " ");
            j++;
        }

        // Using do-while loop to print
        System.out.println("\nEven numbers using do-while loop:");
        int k = 0;
        if (count > 0) {
            do {
                System.out.print(evenNumbers[k] + " ");
                k++;
            } while (k < count);
        }

        sc.close();
    }
}
