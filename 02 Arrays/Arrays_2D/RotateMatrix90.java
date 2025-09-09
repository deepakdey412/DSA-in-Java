public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] arr = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};

        int n = arr.length;
        int[][] rotated = new int[n][n];

        // Rotate the matrix 90 degrees clockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = arr[i][j];
            }
        }

        // Print the rotated matrix
        System.out.println("Rotated Matrix (90 degrees clockwise):");
        for (int[] row : rotated) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
