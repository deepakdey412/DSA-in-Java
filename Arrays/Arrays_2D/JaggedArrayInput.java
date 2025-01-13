import java.util.Scanner;

public class JaggedArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Declare a jagged array
        int[][] jaggedArray = new int[rows][];

        // Dynamically allocate column sizes
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols]; // Assign column size for the row
        }

        // Take input for each element
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter elements for row " + i + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Print the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        sc.close(); // Close scanner
    }
}
