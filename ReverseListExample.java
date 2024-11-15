import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// A class that represents a collection of strings and provides a method to reverse them
class StringList {
    // List to hold the strings
    private List<String> stringList;

    // Constructor to initialize the list
    public StringList() {
        this.stringList = new ArrayList<>();
    }

    // Method to add a string to the list
    public void addString(String str) {
        this.stringList.add(str);
    }

    // Method to reverse the list of strings
    public void reverseList() {
        Collections.reverse(this.stringList);
    }

    // Method to print the list
    public void printList() {
        System.out.println(this.stringList);
    }
}

public class ReverseListExample {
    public static void main(String[] args) {
        // Create an object of StringList class
        StringList myStringList = new StringList();

        // Adding strings to the list
        myStringList.addString("Apple");
        myStringList.addString("Bat");
        myStringList.addString("Cat");
        myStringList.addString("Dog");

        // Print the original list
        System.out.println("Original List:");
        myStringList.printList();

        // Reverse the list
        myStringList.reverseList();

        // Print the reversed list
        System.out.println("Reversed List:");
        myStringList.printList();
    }
}