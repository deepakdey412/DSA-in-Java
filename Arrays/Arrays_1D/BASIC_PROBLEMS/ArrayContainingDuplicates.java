import java.util.*;

public class ArrayContainingDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 45, 1, 2, 4, 1};
        if (containsDuplicates(arr)) {
            System.out.println("Contains Duplicates");

        } else {
            System.out.println("Not Contains Duplicates");
        }
    }

    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; // duplicate found
            }
            set.add(num); // add current number to set
        }
        return false; // no duplicates found
    }

}
