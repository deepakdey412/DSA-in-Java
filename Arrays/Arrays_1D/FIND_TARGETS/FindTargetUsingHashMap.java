import java.util.HashMap;

public class FindTargetUsingHashMap{
    public static void main(String[] args) {
        int[] arr = {10, 2, 30, 4, 50};
        int target = 30;
        int index = findIndexUsingMap(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int findIndexUsingMap(int[] arr, int target) {
        // Create a HashMap to store element -> index mapping
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the map
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        // Retrieve the index of the target if it exists
        return map.getOrDefault(target, -1);  // If target doesn't exist, return -1
    }
}

//HashMap:
//Efficient for multiple lookups since it provides O(1) average time complexity for lookups.
//However, it uses additional memory to store the mapping. Time Complexity for lookup: O(1).