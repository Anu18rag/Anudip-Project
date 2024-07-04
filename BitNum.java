import java.util.Scanner;

public class BitNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Enter the position of the bit to check (0-indexed): ");
        int n = scanner.nextInt();

        boolean isSet = (num & (1 << n)) != 0;

        System.out.println("The " + n + "th bit of " + num + " is " + (isSet ? "set (1)" : "not set (0)"));
    }
}
