import java.util.Scanner;

public class SumOddEvenDigit {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = s.nextInt();
            int evenSum = 0, oddSum = 0;
            while (number != 0) {
                int digit = number % 10;
                
                if (digit % 2 == 0) {
                    evenSum += digit; 
                } else {
                    oddSum += digit; 
                }
                
                number /= 10;
            }   System.out.println("Sum of even digits: " + evenSum);
            System.out.println("Sum of odd digits: " + oddSum);
        }
    }
}
