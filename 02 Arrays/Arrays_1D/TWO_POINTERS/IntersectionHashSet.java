import java.util.*;

public class IntersectionHashSet {//for unsorted array
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 9, 4, 2, 2};
        int[] arr2 = {2, 9, 5, 7};
        List<Integer> intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection: " + intersection);
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
