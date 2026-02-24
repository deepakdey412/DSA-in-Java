import java.util.Arrays;

public class ReverseArray{//By two pointer approach
    public static void main(String[] args) {
        int[] arr = {22,2,554,5,2,5,23,4,3,5};
        reverse(arr);
    }
    public static void reverse(int[] nums){
        int start = 0, end = nums.length-1;
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
