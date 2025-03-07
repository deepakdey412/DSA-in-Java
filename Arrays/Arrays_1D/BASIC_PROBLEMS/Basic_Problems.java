import java.util.Arrays;

public class Basic_Problems {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 2, 5, 2, 7};

        System.out.println("The larget element in arr : " + findLargestElement(arr1));
        System.out.println("The smallest element in arr : " + findSmallestElement(arr1));
        System.out.println("The Larget and Smallest element in arr : " + Arrays.toString(findLargest_and_SmallestElement(arr1)));
        System.out.println("The Sum of all elements of arr : " + sumOfAllElements(arr1));
        System.out.println("The elements '10' exost in arr : " + checkElementIsExistOrNot(arr1, 10));
        System.out.println("The elements '1' exost in arr : " + checkElementIsExistOrNot(arr1, 1));
        System.out.println("Reversed Array : " + Arrays.toString(reverseArr(arr1)));
        System.out.println("Find the occurance of element '2' in arr2  : " + findOccuranceOfElement(arr2, 2));
        System.out.println("Find the index of element '2' in arr2  : " + findIndexOfElement(arr2, 2));
        System.out.println("Find the index of element '10' in arr2  : " + findIndexOfElement(arr2, 10));
    }


    public static int findLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int findSmallestElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int[] findLargest_and_SmallestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return new int[]{max, min};
    }

    public static int sumOfAllElements(int nums[]) {
        int sum = 0;
        for (int value : nums) {
            sum += value;
        }
        return sum;
    }

    public static boolean checkElementIsExistOrNot(int[] nums, int target) {
        boolean result = false;
        for (int vale : nums) {
            if (vale == target) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int[] reverseArr(int[] nums) {
        System.out.println("Original array " + Arrays.toString(nums));
        int start = 0, last = nums.length - 1;
        while (start < last) {
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;
        }
        return nums;
    }

    public static int findOccuranceOfElement(int[] nums, int element) {
        //if we want to find the occurance of SINGLE Element then you this one loop
        int count = 0;
        for (int value : nums) {
            if (value == element) {
                count++;
            }
        }
        return count;
    }

    private static int findIndexOfElement(int[] arr2, int element) {
        for (int i = 0 ;i<arr2.length;i++){
            if (arr2[i] == element){
                return i;
            }
        }
        return -1;
    }


}
