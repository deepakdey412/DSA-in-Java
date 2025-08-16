import java.util.HashMap;
import java.util.Map;

public class FindTheFirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 45, 1, 2, 4, 1};
        int firstNonRepeating = findFirstNonRepeatingElement(arr);

        if (firstNonRepeating != -1) {
            System.out.println("First non-repeating element: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating elements found");
        }
    }

    public static int findFirstNonRepeatingElement(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find first element with count 1
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        return -1; // no non-repeating element
    }
}
