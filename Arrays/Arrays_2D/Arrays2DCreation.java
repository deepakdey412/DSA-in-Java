import java.util.Scanner;

public class Arrays2DCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[2][3]; // 2 rows and 3 columns

        System.out.println(arr2D.length);// Number of rows

        // Input values
        for (int i = 0; i < arr2D.length; i++) { // Loop through rows
            for (int j = 0; j < arr2D[i].length; j++) { // Loop through columns
                System.out.print("Enter value at " + i + " , " + j + " : ");
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing the array:");

        // Print the array
        for (int i = 0; i < arr2D.length; i++) { // Loop through rows
            for (int j = 0; j < arr2D[i].length; j++) { // Loop through columns
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
