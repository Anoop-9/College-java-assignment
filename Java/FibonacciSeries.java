import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacciRecursive(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + " ");
            printFibonacciRecursive(n - 1, b, a + b);
        }
    }
    public static void printFibonacciNonRecursive(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of terms in Fibonacci series: ");
            int n = scanner.nextInt();
            
            System.out.println("Fibonacci series (Recursive):");
            printFibonacciRecursive(n, 0, 1);
            
            System.out.println("\nFibonacci series (Non-Recursive):");
            printFibonacciNonRecursive(n);
        }
    }
}



