public class PairArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The original array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n\nAll unique pairs: ");
        findPairOfTwo(arr);
    }

    public static void findPairOfTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Fix the bound
                System.out.print("{ " + arr[i] + ", " + arr[j] + " } ");
            }
            System.out.println(); // Optional for better output formatting
        }
    }
}
