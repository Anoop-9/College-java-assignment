import java.util.Scanner;

class Calculator {
    private Number num1, num2;

    public Calculator(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        return num1.doubleValue() / num2.doubleValue();
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Number num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        Number num2 = scanner.nextDouble();
        Calculator calc = new Calculator(num1, num2);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
        scanner.close();
    }
}
