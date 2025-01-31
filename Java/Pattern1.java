import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the input for the pattern: ");
            int n = s.nextInt();
            
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println("*");
                } else {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
}