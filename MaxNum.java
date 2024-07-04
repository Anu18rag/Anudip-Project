import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number: " + max);
    }
}