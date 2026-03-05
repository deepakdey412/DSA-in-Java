public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 4, 5, 6};

        if (isSorted(arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // as soon as one wrong pair found, return false
            }
        }
        return true; // if loop completes, array is sorted
    }
}
