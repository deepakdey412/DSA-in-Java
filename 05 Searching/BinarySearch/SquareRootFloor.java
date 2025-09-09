public class SquareRootFloor {
    public static void main(String[] args) {
        System.out.println(findSquareRootFloor(14)); // Expected Output: 3
    }

    public static int findSquareRootFloor(int input) {
        int start = 0;
        int end = input;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid; // Use long to prevent overflow

            if (sq == input) {
                return mid; // Perfect square found
            } else if (sq < input) {
                ans = mid; // Store potential answer
                start = mid + 1; // Move right to find larger values
            } else {
                end = mid - 1; // Move left to find smaller values
            }
        }
        return ans; // Floor value of square root
    }
}
