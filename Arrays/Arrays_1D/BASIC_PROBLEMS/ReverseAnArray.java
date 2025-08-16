import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 56, 5, 95, 4, 5, 2};

        method01(arr);
        method02(arr.clone()); // use clone so original array isn’t mutated
        method03(arr);
    }

    public static void method01(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void method02(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void method03(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        Collections.reverse(arrList);
        for (int num : arrList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
