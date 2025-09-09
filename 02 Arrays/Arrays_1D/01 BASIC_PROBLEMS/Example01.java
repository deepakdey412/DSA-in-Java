import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element in arrya at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Print the array : ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
