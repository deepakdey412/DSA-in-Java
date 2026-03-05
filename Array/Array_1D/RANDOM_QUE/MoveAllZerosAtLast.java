package intermidate_problems;

import java.util.Arrays;

public class MoveAllZerosAtLast {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,4,0};

        System.out.println("Result arr Mehtod 01: "+ Arrays.toString(moveAllZerosSwap(arr)));
        System.out.println("Result arr method 02: "+ Arrays.toString(moveAllZeros(arr)));
    }
    public static int[] moveAllZerosSwap(int[] nums) {
        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        return nums;
    }

    public static int[] moveAllZeros(int[] nums){
        int index = 0;
        for (int value  : nums){
            if (value != 0){
                nums[index++]= value;
            }
        }
        while (index < nums.length){
            nums[index++]= 0;
        }
        return nums;
    }

}
