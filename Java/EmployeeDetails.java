import java.util.Scanner;

class Employee {
    int id;
    String name;
    int age;
    String department;
    public Employee(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Department: " + department);
        System.out.println("---------------------------");
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Employee[] employees = new Employee[5];
            
            for (int i = 0; i < employees.length; i++) {
                System.out.println("Enter details for Employee " + (i + 1) + ":");                
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();                
                System.out.print("Enter Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();                
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();               			 
                System.out.print("Enter Department: ");
                scanner.nextLine();
                String department = scanner.nextLine();   
                employees[i] = new Employee(id, name, age, department);
            }
            System.out.println("\nEmployee Details:");
            for (Employee emp : employees) {
                emp.displayDetails();
            }
        }
    }
}
