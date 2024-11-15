import java.util.Scanner;
// Define the MathematicalOperation class
class MathematicalOperation{
    // Instance methods to perform calculations
    public double add(double a, double b) {
        return a + b;
    }
        public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return 0;
        } else {
            return a / b;
        }
    }
}
// Calculator is Main class to interact with the MathematicalOperation object
public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Calculator class
        MathematicalOperation calculator = new MathematicalOperation();
        while (true) {
            System.out.println("\nMathematical Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting the calculator. Thankyou!");
                break;
            }
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();
                double result;
                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        System.out.println("The result of addition is: " + result);
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        System.out.println("The result of subtraction is: " + result);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        System.out.println("The result of multiplication is: " + result);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        System.out.println("The result of division is: " + result);
                        break;
                    default:
                        System.out.println("Invalid input! Please enter a number between 1 and 5.");
                }
        }
        // Close the scanner
        scanner.close();
    }
}