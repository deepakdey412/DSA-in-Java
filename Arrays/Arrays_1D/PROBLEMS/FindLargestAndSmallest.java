public class FindLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {10000, 542, 333, 4, 2125, 653, 8878, 466, 5454, 10245, 7884, 9131, 540};
        int largestNum = findLargest(arr);
        int smallesNum = findSmallest(arr);
        System.out.println("The largest number is : " + largestNum + " \nThe smallest number is : " + smallesNum);

    }

    public static int findLargest(int[] arr) {
        int target = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                target = arr[i];
            }
        }
        return target;
    }
    public static int findSmallest(int[] arr) {
        int target = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                target = arr[i];
            }
        }
        return target;
    }
}
