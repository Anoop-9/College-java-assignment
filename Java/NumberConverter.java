import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("Menu:");
                System.out.println("1. Convert to Binary");
                System.out.println("2. Convert to Hexadecimal");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = s.nextInt();
                
                if (choice == 1 || choice == 2) {
                    System.out.print("Enter a number: ");
                    int number = s.nextInt();
                    
                    if (choice == 1) {
                        System.out.println("Binary format: " + Integer.toBinaryString(number));
                    } else if (choice == 2) {
                        System.out.println("Hexadecimal format: " + Integer.toHexString(number).toUpperCase());
                    }
                } else if (choice != 3) {
                    System.out.println("Invalid choice. Please try again.");
                }
                
            } while (choice != 3);
        }
    }
}
