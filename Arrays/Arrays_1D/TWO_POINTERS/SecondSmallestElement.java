public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 20, -4, 15}; // unsorted array
        System.out.println("Second Smallest element : " + secondSmallest(arr));
    }

    public static int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
}
