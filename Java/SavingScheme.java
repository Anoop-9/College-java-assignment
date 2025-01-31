import java.util.Scanner;

public class SavingScheme {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the initial principal amount: ");
            double principal = s.nextDouble();
            
            System.out.print("Enter the rate of interest (in %): ");
            double rate = s.nextDouble();
            
            System.out.print("Enter the time (in years): ");
            int time = s.nextInt();
            
            double interest = (principal * rate * time) / 100;
            double finalAmount = principal + interest;
            
            System.out.println("Accrued Interest: " + interest);
            System.out.println("Final Amount: " + finalAmount);
        }
    }
}
