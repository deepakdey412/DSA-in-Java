package intermidate_problems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,4,4,5};
        System.out.println("Unique Element array : "+Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] nums){
        int i = 0;
        for (int j=0;j< nums.length;j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }

//        i++;
//        while (i < nums.length){
//            nums[i++] = 0;
//        }
        return nums;
    }
}
