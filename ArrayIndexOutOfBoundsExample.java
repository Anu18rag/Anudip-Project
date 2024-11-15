public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Create an array with elements from 1 to 10
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }

        try {
            // Intentionally access an element beyond the last index
            for (int i = 0; i <= 10; i++) { // Notice the loop goes to 10 (out of bounds)
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
    }
}