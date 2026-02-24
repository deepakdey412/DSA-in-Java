public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8, 15};//Array can be sorted or unsorted
        System.out.println("Second Largest element : " + secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
}
