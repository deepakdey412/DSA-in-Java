public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(arr));  // Output: 1 or 5 (both are peaks)
    }

    public static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;  // Peak is in the left half
            } else {
                start = mid + 1;  // Peak is in the right half
            }
        }
        return start;  // 'start' will end up at a peak element
    }
}
