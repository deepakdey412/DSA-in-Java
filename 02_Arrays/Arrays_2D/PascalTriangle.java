import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int[][] pascalTriangle = new int[n][];

        for (int i = 0; i < n; i++) {
            //creating a array for each row
            pascalTriangle[i] = new int[i + 1];

            // First and last element will always be 1
            pascalTriangle[i][0] = pascalTriangle[i][i] = 1;

            //Main Logic
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j] + pascalTriangle[i - 1][j - 1];
            }
                System.out.println(Arrays.toString(pascalTriangle[i]));
        }
    }
}
