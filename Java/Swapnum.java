import java.util.Scanner;
public class Swapnum {
    public static void main(String[] args) {
        int a,b;
        try (Scanner s = new Scanner(System.in)) {
             System.out.print("\nEnter the first number (a): ");
            a = s.nextInt();
            System.out.print("Enter the second number (b): ");
            b = s.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("\nAfter Swapping (Without Using Third Variable):");
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}