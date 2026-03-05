import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 45, 1, 2, 4, 1};
        int firstDuplicate = findFirstRepeatingElement(arr);

        if (firstDuplicate != 0) {  // 0 means no duplicate found in your logic
            System.out.println("First repeating element: " + firstDuplicate);
        } else {
            System.out.println("No repeating elements found");
        }
    }

    public static int findFirstRepeatingElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {  // check if already exists
                return num;            // first duplicate found
            }
            set.add(num);               // add current number to set
        }
        return 0; // no duplicates found
    }
}
