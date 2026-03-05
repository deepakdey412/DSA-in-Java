import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 47, 10, 6, 9, 8};
        boolean swapped = false;

        // Bubble Sort Implementation
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { // Descencding order
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;// set true if swapped happened
                }
                // If no two elements were swapped, array is sorted
                if (!swapped) {
                    break;
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
