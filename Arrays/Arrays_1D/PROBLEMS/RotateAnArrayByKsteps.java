import java.util.Arrays;

public class RotateAnArrayByKsteps {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 8; // Number of steps to rotate

        // Perform the rotation
        int[] rotatedArray = rotateArrayByKSteps(arr, k);

        // Output the result
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Rotated array by " + k + " step(s): " + Arrays.toString(rotatedArray));
    }

    public static int[] rotateArrayByKSteps(int[] arr, int k) {
        int n = arr.length;
        int[] rotatedArray = new int[n];

        // Adjust k to handle cases where k > n
        k = k % n;

        // Copy last `k` elements to the start of the new array
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = arr[n - k + i];
        }

        // Copy the remaining elements
        for (int i = k; i < n; i++) {
            rotatedArray[i] = arr[i - k];
        }

        return rotatedArray;
    }
}


