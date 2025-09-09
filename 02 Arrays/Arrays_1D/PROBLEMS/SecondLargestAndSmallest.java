public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        findSecondLargestAndSmallest(arr);
    }

    public static void findSecondLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize variables
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // Update smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE || secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second largest or smallest element found.");
        } else {
            System.out.println("Second Largest: " + secondLargest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }
}













//    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,6,8,400,4,113,8,4,2};
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(" the second largest element is : "+ arr[1]);
//        System.out.println(" the second largest element is : "+ arr[arr.length-2]);
//    }
