package intermidate_problems;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int result = findSecondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + result);
        }
    }

    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            return Integer.MIN_VALUE; // Indicating no second largest element
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return secondLargest;
    }
}
