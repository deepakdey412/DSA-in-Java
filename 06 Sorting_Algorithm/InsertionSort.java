import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 54, 87, 4, 5, 1, 45, 2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(j, j - 1, arr);
                j--;
            }
        }
        return arr;
    }

    public static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//Best case	    -> O(n) (array already sorted)
//Worst case	-> O(n²) (array sorted in reverse)
//Average case	-> O(n²)
//Space Complexity: O(1)