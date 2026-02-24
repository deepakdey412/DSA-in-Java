import java.util.Scanner;

public class SumOfElementInArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter the element at index : "+i+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Approach 1st : \nSum of elements of array is : "+ sum01(arr));
        System.out.println("Approach 2nd : \nSum of elements of array is : "+ sum02(arr));

    }
    public static int sum01(int[] arr){
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int sum02(int[] arr){
        int sum = 0;
        for (int value : arr){
            sum = sum + value;
        }
        return sum;
    }


}
