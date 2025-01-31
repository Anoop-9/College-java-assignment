import java.util.Scanner;

public class NumberConversion {
    public static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }
        return binary.reverse().toString();
    }
    public static String toHexadecimal(int number) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (number > 0) {
            hex.append(hexChars[number % 16]);
            number /= 16;
        }
        return hex.reverse().toString();
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            
            String binary = toBinary(input);
            String hexadecimal = toHexadecimal(input);
            
            System.out.println("Binary Representation: " + binary);
            System.out.println("Hexadecimal Representation: " + hexadecimal);
        }
    }
}





