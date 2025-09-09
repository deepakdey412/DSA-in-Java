import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);

        System.out.print("After removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; // unique element ka index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // new length
    }
}
// Rule of Thumb:
//     - For sorted arrays → Two-Pointer is most optimal
//     - For unsorted arrays → HashSet is simpler and efficient
