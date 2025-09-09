import java.util.Scanner;

public class CountGeterNumOfTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 6, 7};
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Enter the number : ");
        int target = sc.nextInt();

        int allGreaterNumOccurance = findAllGreaterNumOcc(arr, target);
        System.out.println("The Last occurance of the element greter than " + target + " is : " + allGreaterNumOccurance);
    }

    public static int findAllGreaterNumOcc(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                count++;
            }
        }
        return count;
    }
}