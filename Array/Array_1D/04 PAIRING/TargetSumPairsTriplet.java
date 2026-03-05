//Count the numbers of pair whose sum is target

public class TargetSumPairsTriplet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 10};

        int target = 10;

        int numOfPairs = findPairs(arr, target);
        System.out.println("Numbers of pair whose sum is " + target + " is : " + numOfPairs);
    }

    public static int findPairs(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
