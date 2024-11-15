import java.util.HashMap;

class Employee1 {
    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class HashMapEx {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Employee1> employee1Map = new HashMap<>();

        // Create Employee objects
        Employee1 emp1 = new Employee1(1, "John");
        Employee1 emp2 = new Employee1(2, "Alice");
        Employee1 emp3 = new Employee1(3, "Bob");

        // Associate values with keys in the HashMap
        employee1Map.put("E001", emp1);
        employee1Map.put("E002", emp2);
        employee1Map.put("E003", emp3);

        System.out.println("Employee Map:");
        for (String key : employee1Map.keySet()) {
            System.out.println(key + " -> " + employee1Map.get(key));
        }

        // Update an existing value
        Employee1 updatedEmp2 = new Employee1(2, "Alice Smith");
        employee1Map.put("E002", updatedEmp2);

        System.out.println("\nUpdated Employee Map:");
        for (String key : employee1Map.keySet()) {
            System.out.println(key + " -> " + employee1Map.get(key));
        }

        // Remove a key-value pair
        employee1Map.remove("E003");

        System.out.println("\nEmployee Map after removal:");
        for (String key : employee1Map.keySet()) {
            System.out.println(key + " -> " + employee1Map.get(key));
        }
    }
}


