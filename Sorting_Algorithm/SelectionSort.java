package Sorting_Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 100, 8, 45, 71, 63, 78, 16 };

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) { // unnecessary swap avoid
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

// TC => O(n^2)

// STEPS =>
// Assume first element as minimum.
// Traverse the rest of the array to find the smallest element.
// Swap it with the current position.
// Move to the next position and repeat.
// Continue until the array is sorted.