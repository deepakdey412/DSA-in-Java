public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(binarySearch(arr, 4));  // Expected Output: 3
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  // Target found, return index
            } else if (arr[mid] < target) {
                start = mid + 1;  // Search right half
            } else {
                end = mid - 1;  // Search left half
            }
        }

        return -1;  // Target not found
    }
}
