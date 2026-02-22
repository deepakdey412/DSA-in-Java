import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {//by two pointer approach
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target){
        int start = 0,end = arr.length - 1;
        while (start<end){
            int sum = arr[start] + arr[end];
            if (sum == target){
                return new int[]{start, end};
            } else if (sum<target) {
               start++;
            }else {
                end--;
            }
        }
        return new int[]{};
    }
}
//NOTE : TWO POINTER WILL ONLY APPLY IF THE ARRAY IS SORTED