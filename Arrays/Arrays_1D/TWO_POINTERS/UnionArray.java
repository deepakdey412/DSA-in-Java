import java.util.HashSet;
import java.util.Set;

public class UnionArray { // for unsorted array this approach is optimal
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 6};
        findUnion(arr1, arr2);
    }

    public static void findUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Union of two arrays: " + set);
    }
}
