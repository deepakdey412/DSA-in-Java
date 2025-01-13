public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Create a new matrix to store the transpose
        int[][] transpose = new int[arr1[0].length][arr1.length];

        // Compute the transpose
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                transpose[i][j] = arr1[j][i];
            }
        }

        // Print the transposed matrix
        System.out.println("Original Matrix:");
        printMatrix(arr1);

        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
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
