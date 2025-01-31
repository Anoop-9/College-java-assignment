import java.util.Scanner;

public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = s.nextInt();
            
            int sumOfDigits = 0;
            int temp = number;
            
            while (temp != 0) {
                sumOfDigits += temp % 10; 
                temp /= 10;             
            }
            
            if (number % sumOfDigits == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
