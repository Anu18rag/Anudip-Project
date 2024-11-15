import java.util.ArrayList;

// A class that represents a collection of integers and provides methods to work with even numbers
class NumberList {
    // List to hold the integers
    private ArrayList<Integer> numbers;

    // Constructor to initialize the list
    public NumberList() {
        this.numbers = new ArrayList<>();
    }

    // Method to add an integer to the list
    public void addNumber(int number) {
        this.numbers.add(number);
    }

    // Method to calculate the sum of all even numbers in the list
    public int calculateSumOfEvenNumbers() {
        int sum = 0;  // Initialize the sum of even numbers to 0

        // Loop through the list of numbers
        for (int number : this.numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                sum += number;  // Add the even number to the sum
            }
        }

        // Return the calculated sum of even numbers
        return sum;
    }
    
    // Method to print the list of numbers
    public void printNumbers() {
        System.out.println("Numbers in the list: " + this.numbers);
    }
}

public class SumEvenNumbers {
    public static void main(String[] args) {
        // Create an object of NumberList class
        NumberList myNumberList = new NumberList();

        // Adding integers to the list
        myNumberList.addNumber(10);
        myNumberList.addNumber(15);
        myNumberList.addNumber(20);
        myNumberList.addNumber(25);
        myNumberList.addNumber(30);

        // Print the list of numbers
        myNumberList.printNumbers();

        // Calculate the sum of even numbers
        int sumOfEven = myNumberList.calculateSumOfEvenNumbers();

        // Print the sum of even numbers
        System.out.println("Sum of even numbers: " + sumOfEven);
    }
}