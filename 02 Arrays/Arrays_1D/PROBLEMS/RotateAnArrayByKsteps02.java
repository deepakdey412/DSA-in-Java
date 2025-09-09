import java.util.Arrays;

public class RotateAnArrayByKsteps02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 1; // Number of steps to rotate

        // Perform the in-place rotation
        rotateArrayInPlace(arr, k);

        // Output the result
        System.out.println("Rotated array by " + k + " step(s): " + Arrays.toString(arr));
    }

    public static void rotateArrayInPlace(int[] arr, int k) {
        int n = arr.length;

        // Adjust k to handle cases where k > n
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse a portion of the array in-place
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
