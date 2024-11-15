public class ArrayIndexOutofBoundExceptionExample{

    public static void main(String[] args) {
        // Create an array with elements from 1 to 100
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        try {
            // Call the method that accesses the array
            accessArrayElement(array, 100); // Attempt to access the element at index 100 (out of bounds)
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            e.printStackTrace();
        }
    }

    // Method to access an element in the array
    public static void accessArrayElement(int[] array, int index) {
        System.out.println("Accessing element at index " + index + ": " + array[index]);
    }
}