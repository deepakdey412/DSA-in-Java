import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateLeft(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // in case k > n
        reverse(arr, 0, k - 1);     // Step 1
        reverse(arr, k, n - 1);     // Step 2
        reverse(arr, 0, n - 1);     // Step 3
    }

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
