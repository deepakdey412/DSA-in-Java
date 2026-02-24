import java.util.Arrays;

public class DeepAndShallowCloning {

    // Method to print array elements
    public static void printArray(int[] arr) {
        // Iterate through the array and print each value
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: ");
        printArray(arr);

        // Shallow copy: Reference assignment, both arr and arr02 point to the same array
        int[] arr02 = arr;
        System.out.println("Shallow cloning by reference arr02 -> arr : ");
        printArray(arr02);

        // Deep copy: Using clone() - creates a new array in memory and copies the values
        int[] arr03 = arr.clone();
        System.out.println("Deep cloning by arr03.clone() - creates a new array in heap:");
        printArray(arr03);

        // Deep copy: Using Arrays.copyOf() - creates a new array of specified length and copies the values
        int[] arr04 = Arrays.copyOf(arr, 1);  // Length is specified as 1, so only the first element is copied
        System.out.println("Cloning by Arrays.copyOf() method:");
        printArray(arr04);

        // Deep copy: Using Arrays.copyOfRange() - copies elements from a specified range (start index to end index)
        int[] arr5 = Arrays.copyOfRange(arr, 1, 3);  // Copies elements from index 1 to 2 (end index is exclusive)
        System.out.println("Cloning by Arrays.copyOfRange() method (from index 1 to index 3):");
        printArray(arr5);
    }
}
