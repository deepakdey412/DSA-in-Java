package intermidate_problems;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElements{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 5, 1, 3, 2};

        Set<Integer> result = removeDuplicates(arr);
        System.out.println(result);  // Prints the Set
    }

    public static Set<Integer> removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int value : nums) {
            set.add(value);
        }

        return set;
    }
}
