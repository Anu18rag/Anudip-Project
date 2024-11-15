import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int remainder = temp % 10;
            sum = sum + factorial(remainder);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is not a Strong Number");
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
