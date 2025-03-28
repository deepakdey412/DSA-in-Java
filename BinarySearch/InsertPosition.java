public class InsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(find(arr, 2));  // Expected Output: 1
        System.out.println(find(arr, 7));  // Expected Output: 4
        System.out.println(find(arr, 0));  // Expected Output: 0
    }

    public static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  // If the element exists, return its index
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start; // The correct insertion position
    }
}
