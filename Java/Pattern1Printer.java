import java.util.Scanner;

public class Pattern1Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            char ch = 'A'; 
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++; 
            }
            System.out.println(); 
        }
    }
}



