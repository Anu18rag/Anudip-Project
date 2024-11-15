import java.util.Stack;

// A class that manages a stack of integers and provides methods to manipulate it
class StackManager {
    // Stack to hold integer elements
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public StackManager() {
        this.stack = new Stack<>();
    }

    // Method to push elements onto the stack
    public void pushElements(int numElements) {
        for (int i = 1; i <= numElements; i++) {
            stack.push(i);  // Push integers from 1 to numElements onto the stack
        }
        System.out.println("Stack after pushing " + numElements + " elements: " + stack);
    }

    // Method to pop a specified number of elements from the stack
    public void popElements(int numElements) {
        System.out.println("Removing " + numElements + " elements from the stack:");
        for (int i = 1; i <= numElements; i++) {
            if (!stack.isEmpty()) {
                int removedElement = stack.pop();  // Remove the top element from the stack
                System.out.println("Removed element: " + removedElement);
            } else {
                System.out.println("Stack is empty, cannot remove more elements.");
                break;
            }
        }
    }

    // Method to display the current state of the stack
    public void displayStack() {
        System.out.println("Current stack: " + stack);
    }
}

public class StackExample {
    public static void main(String[] args) {
        // Create an object of StackManager class
        StackManager stackManager = new StackManager();

        // Push 10 elements onto the stack
        stackManager.pushElements(10);

        // Pop 4 elements from the stack
        stackManager.popElements(4);

        // Display the current state of the stack after popping
        stackManager.displayStack();
    }
}