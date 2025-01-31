import java.util.Scanner;

public class SumDigitAnalysis {
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static boolean isArmstrong(int number) {
        int original = number, sum = 0, digits = String.valueOf(number).length();
        while (number > 0) {
            sum += Math.pow(number % 10, digits);
            number /= 10;
        }
        return sum == original;
    }
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            
            int sum = sumOfDigits(input);
            System.out.println("Sum of digits: " + sum);
            
            if (isPrime(sum)) {
                System.out.println("The sum of digits is a Prime number.");
            } else {
                System.out.println("The sum of digits is not a Prime number.");
            }
            
            if (isArmstrong(sum)) {
                System.out.println("The sum of digits is an Armstrong number.");
            } else {
                System.out.println("The sum of digits is not an Armstrong number.");
            }
            
            if (isPerfect(sum)) {
                System.out.println("The sum of digits is a Perfect number.");
            } else {
                System.out.println("The sum of digits is not a Perfect number.");
            }
        }
    }
}
