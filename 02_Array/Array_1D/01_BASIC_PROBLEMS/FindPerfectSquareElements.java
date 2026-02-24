public class FindPerfectSquareElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 16, 20};

        System.out.println("Perfect square elements in the array:");
        for (int num : arr) {
            if (isPerfectSquare(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false; // negative numbers cannot be perfect squares
        }
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
