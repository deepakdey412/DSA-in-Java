import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeros(int[] arr) {
        int nonZeroIndex = 0; // pointer for placing non-zeros

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Step 2: Fill remaining places with zero
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
