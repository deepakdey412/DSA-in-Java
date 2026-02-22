public class TransposeOfMatrixInPlace {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(arr1);

        // Perform in-place transpose
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1[0].length; j++) {
                // Swap elements
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }

        // Print transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(arr1);
    }

    // Helper method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
