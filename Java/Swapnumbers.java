import java.util.Scanner;
public class Swapnumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number (a): ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number (b): ");
            int b = scanner.nextInt();
            System.out.println("\nBefore Swapping:");
            System.out.println("a = " + a + ", b = " + b);
            int temp = a;
            a = b;
            b = temp;
            System.out.println("\nAfter Swapping (Using Third Variable):");
            System.out.println("a = " + a + ", b = " + b);
            System.out.print("\nRe-enter the first number (a): ");
            a = scanner.nextInt();
            System.out.print("Re-enter the second number (b): ");
            b = scanner.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("\nAfter Swapping (Without Using Third Variable):");
            System.out.println("a = " + a + ", b = " + b);
        }
    }
}

