import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {2, 3, 4}, {7, 8, 9}};
        int[][] arr3 = {{10, 20, 13}, {52, 23, 54}, {17, 68, 19}};
        System.out.println("Original Array 1 :  ");
        printArr(arr);
        System.out.println("Original Array 2 :  ");
        printArr(arr2);

        System.out.println("Adding 2 matxices : ");
        addTwoMat(arr, arr2);

        System.out.println("Multiply 2 matxices : ");
        mulTwoMat(arr, arr2);

        System.out.println("Transpose of Matrix 1 : ");
        transposeOfMat(arr);

        System.out.println("Transpose of Matrix 2 (without Space) : ");
        transposeOfMatwitoutSpace(arr2);

        System.out.println("Rotate Matrix at 90 : ");
        rotateMatAt90(arr3);


    }

    static void addTwoMat(int[][] arr, int[][] arr2) {
        if (arr.length == arr2.length && arr[0].length == arr2[0].length) {
            int[][] newArr = new int[arr.length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    newArr[i][j] = arr[i][j] + arr2[i][j];
                }
            }
            printArr(newArr);
        } else {
            System.out.println("Dimention of the two matrixes are different so we can't add them ");
        }
    }

    static void mulTwoMat(int[][] arr, int[][] arr2) {
        if (arr[0].length == arr2.length) {// resultent mat dimension is : arr.length * arr2[0].length
            int[][] newArr = new int[arr.length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    for (int k = 0; k < arr.length; k++) {
                        newArr[i][j] += arr[i][k] * arr2[k][j];
                    }
                }
            }
            printArr(newArr);
        }
    }

    static void transposeOfMat(int[][] arr) {
        int[][] newArr = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[i][j] = arr[j][i];
            }
        }
        printArr(newArr);
    }

    static void transposeOfMatwitoutSpace(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start from i+1 to avoid redundant swaps
                // this logic is only applicable for the square matrix
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArr(arr);
    }

    static void rotateMatAt90(int[][] arr) {
        int n = arr.length;
        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // In-place row reversal
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        printArr(arr);
    }

    static void printArr(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
