import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 10, 14, 5, 7, 3, 4, 5, 6};
        int target = 14;

        System.out.println(Arrays.toString(findTargetSum(arr, target)));
    }

    public static int[] findTargetSum(int[] arr, int k) {
        int sum = 0;
        int[] returnArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                sum = arr[i] + arr[j];
                if (sum == k) {
                    returnArr[0] = arr[i];
                    returnArr[1] = arr[j];
                    return returnArr;
                }
            }
        }
        return new int[] {-1, -1};
    }
}
