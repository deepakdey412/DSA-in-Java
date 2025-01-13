import java.util.Scanner;

public class LastOccuranceOfElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 1, 2, 4, 6, 8, 4, 5, 6, 7, 9, 4, 5, 33};
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Enter the number you want to know the occurance of : ");
        int target = sc.nextInt();

        int lastOccurance = findOcc(arr, target);
        System.out.println("The Last occurance of the element " + target + " is : " + lastOccurance);
    }

    public static int findOcc(int[] arr, int num) {
        int lastOcc = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                if (lastOcc <= i) {
                    lastOcc = i;
                }
            }
        }
        return lastOcc;
    }
}