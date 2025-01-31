public class Displayoperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 
        
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); 
        System.out.println("a != b: " + (a != b)); 
        System.out.println("a > b: " + (a > b));   
        System.out.println("a < b: " + (a < b));   
        System.out.println("a >= b: " + (a >= b)); 
        System.out.println("a <= b: " + (a <= b)); 

        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); 
        System.out.println("x || y: " + (x || y)); 
        System.out.println("!x: " + (!x));         
    }
}
