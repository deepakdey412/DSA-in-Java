public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findCeiling(arr, 10));  // Expected Output: 14
    }

    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int smallestCeiling = -1;  // Initialize with an invalid value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                smallestCeiling = arr[mid];  // Potential answer
                end = mid - 1;  // Move left to find a smaller valid value
            } else {
                start = mid + 1;  // Move right
            }
        }

        return smallestCeiling;
    }
}
