public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findFloor(arr, 10));  // Expected Output: 9
    }

    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int floor = -1; // Initialize with an invalid value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                floor = arr[mid];  // Potential answer
                start = mid + 1;   // Move right to find a larger valid value
            } else {
                end = mid - 1;     // Move left
            }
        }

        return floor;
    }
}
