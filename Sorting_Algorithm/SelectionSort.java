import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 25, 40, 59, 23, 45};

        // Outer loop for moving the boundary of the unsorted subarray
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of the smallest element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted subarray
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
