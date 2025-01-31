import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int x = 0, y = 0, n = 0;
            while (true) {
                System.out.print("Enter the lower limit (X): ");
                x = s.nextInt();
                System.out.print("Enter the upper limit (Y): ");
                y = s.nextInt();
                
                if (x > 0 && y > 0 && y > x) {
                    break;
                } else {
                    System.out.println("Invalid input :(");
                }
            }   while (true) {
                System.out.print("Enter the number of prime numbers to print (N): ");
                n = s.nextInt();
                
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Invalid input :(");
                }
            }   System.out.println("Prime Numbers:");
            printPrime(x, y, n);
        }
    }

    private static void printPrime(int x, int y, int n) {
        int count = 0;

        for (int i = x; i <= y && count < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No prime numbers found in the given range.");
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
