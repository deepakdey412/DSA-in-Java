import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum02 {//by two pointer approach
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i< arr.length;i++){
            int contains = target - arr[i];
            if (map.containsKey(contains)){
                return new int[]{map.get(contains), i };
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}
