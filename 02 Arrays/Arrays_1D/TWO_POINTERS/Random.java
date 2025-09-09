public class Random {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Difference : " + difference(arr));
    }

    public static int difference(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i] - 1;
            }
        }
        int sum1 = 0, sum2 = 0;
        // Step 2: First 4 elements
        for (int i = 0; i < 4; i++) {
            sum1 += arr[i];
        }
        // Step 3: Last 4 elements
        for (int i = arr.length - 4; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return Math.abs(sum1 - sum2);
    }
}
