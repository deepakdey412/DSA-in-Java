public class RotateMatrix90Method02 {
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};

        System.out.println("Original array:");
        printMatrix(arr);

        // Step 1: Transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("After Transpose:");
        printMatrix(arr);

        // Step 2: Reverse each row of the transposed matrix
        for (int i = 0; i < arr.length; i++) {
            reverseRow(arr[i]);
        }

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(arr);
    }

    // Helper function to reverse a single row
    private static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    // Helper function to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
