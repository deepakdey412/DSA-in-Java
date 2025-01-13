import java.util.Arrays;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
        int[][] arr2 = {{6, 28, 3}, {44, 10, 16}, {4, 5, 6}};

        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            // Create a result matrix with the same dimensions
            int[][] arr3 = new int[arr1.length][arr1[0].length];

            // Perform matrix addition
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            // Print the resultant matrix
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3[i].length; j++) {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices are not of the same size. Cannot perform addition.");
        }
    }
}
