import java.util.Scanner;

public class SumOfOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at index : " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of odd elements of array is : " + oddSum(arr));

    }

    public static int oddSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
