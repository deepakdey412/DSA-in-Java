public class CheckArrayIsSortedInAscendingOrDescending {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};    // ascending
        int[] arr2 = {9, 7, 5, 3, 1};    // descending
        int[] arr3 = {1, 3, 2, 4, 5};    // not sorted

        System.out.println("Array 1: " + checkOrder(arr1));
        System.out.println("Array 2: " + checkOrder(arr2));
        System.out.println("Array 3: " + checkOrder(arr3));
    }

    // Method to check whether array is ascending, descending, or not sorted
    public static String checkOrder(int[] arr) {
        boolean isAscending = true;   // assume ascending
        boolean isDescending = true;  // assume descending

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;  // violates ascending order
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false; // violates descending order
            }
        }

        if (isAscending) {
            return "Ascending";
        } else if (isDescending) {
            return "Descending";
        } else {
            return "Not Sorted";
        }
    }
}
