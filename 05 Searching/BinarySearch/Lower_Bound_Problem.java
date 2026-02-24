package Sorting_Problems.Binary_Search;

public class Lower_Bound_Problem {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 7, 8, 9 };
        int target = 7;

        System.out.println(findSmallestIndex(arr, target));
    }

    public static int findSmallestIndex(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length; // default if not found

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid; // possible answer
                high = mid - 1; // search left side
            } else {
                low = mid + 1; // search right side
            }
        }

        return ans;
    }
}