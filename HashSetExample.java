import java.util.HashSet;

// Class that manages a HashSet of strings and provides methods to manipulate it
class HashSetManager {
    // HashSet to hold string elements
    private HashSet<String> set;

    // Constructor to initialize the HashSet
    public HashSetManager() {
        this.set = new HashSet<>();
    }

    // Method to add an element to the HashSet
    public void addElement(String element) {
        boolean added = set.add(element); // Add the element to the set
        if (added) {
            System.out.println("\"" + element + "\" added to the HashSet.");
        } else {
            System.out.println("\"" + element + "\" already exists in the HashSet.");
        }
    }

    // Method to display the elements in the HashSet
    public void displaySet() {
        System.out.println("Current HashSet: " + set);
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        // Create an object of HashSetManager class
        HashSetManager hashSetManager = new HashSetManager();

        // Adding initial elements to the set
        hashSetManager.addElement("Apple");
        hashSetManager.addElement("Banana");
        hashSetManager.addElement("Cherry");

        // Display the set after adding initial elements
        hashSetManager.displaySet();

        // Append a new element to the set
        hashSetManager.addElement("Date");

        // Display the set after appending the new element
        hashSetManager.displaySet();
    }
}