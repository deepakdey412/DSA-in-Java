import java.util.*;

public class NearestGreaterToRight {
    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];  // Array to store the answers
        Stack<Integer> stack = new Stack<>();  // Stack to track next greater elements

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from stack that are smaller or equal to current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, there is no greater element to the right
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                // The top of the stack is the next greater element
                result[i] = stack.peek();
            }

            // Push the current element into the stack for future comparisons
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};  // Example input
        int[] result = findNextGreater(arr);

        // Print the result
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}
