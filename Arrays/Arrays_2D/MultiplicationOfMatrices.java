import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{10, 20, 32}, {40, 5, 60}, {7, 8, 9}};

        // Validate if matrix multiplication is possible
        if (arr1[0].length != arr2.length) {
            System.out.println("Matrix multiplication is not possible. Columns of arr1 must match rows of arr2.");
            return;
        }

        // Resultant matrix dimensions
        int[][] mularr = new int[arr1.length][arr2[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < arr1.length; i++) { // Loop over rows of arr1
            for (int j = 0; j < arr2[0].length; j++) { // Loop over columns of arr2
                for (int k = 0; k < arr1[0].length; k++) { // Loop over rows of arr2
                    mularr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int[] row : mularr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
