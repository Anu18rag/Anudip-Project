import java.util.HashMap;

// Custom Employee2 class
class Employee2 {
    int id;
    String name;

    // Constructor
    Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString method for printing employee details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class HashMapEx2 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Employee2> employee2Map = new HashMap<>();

        // Check if HashMap is empty
        System.out.println("Is HashMap empty? " + employee2Map.isEmpty());

        // Add key-value pairs to HashMap
        employee2Map.put("E001", new Employee2(1, "John"));
        employee2Map.put("E002", new Employee2(2, "Alice"));
        employee2Map.put("E003", new Employee2(3, "Bob"));

        // Check if HashMap is empty after adding elements
        System.out.println("Is HashMap empty after adding elements? " + employee2Map.isEmpty());

        // Print HashMap contents
        System.out.println("HashMap contents:");
        for (String key : employee2Map.keySet()) {
            System.out.println(key + " -> " + employee2Map.get(key));
        }

        // Remove all elements from HashMap
        employee2Map.clear();

        // Check if HashMap is empty after clearing
        System.out.println("Is HashMap empty after clearing? " + employee2Map.isEmpty());
    }
}

