public class ArraySortedCheck {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1}; // Decending Order Array
//        int[] arr = {1, 2, 3, 4, 5}; // Ascending Order Array


        if (isSortedAsc(arr)) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isSortedDesc(arr)) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    public static boolean isSortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
