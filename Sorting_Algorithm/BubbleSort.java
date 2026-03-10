package Sorting_Algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 100, 8, 45, 71, 63, 78, 16 };

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSwaped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
        return arr;
    }
}

// **Bubble Sort (Short Notes)**

// * Compare **adjacent elements** and **swap if they are in the wrong order**.
// * After each pass, the **largest element moves to the end**.
// * **Time Complexity:**

// * Worst & Average → `O(n²)`
// * Best → `O(n)` (when using a **swapped flag** and array is already sorted)
// * **Space Complexity:** `O(1)` (in-place sorting)
