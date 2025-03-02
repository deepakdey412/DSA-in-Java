import java.util.Stack;

public class Next_Greatest_Element {//Brute force O(n^2)
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 0, 1, 3, 4};

        Stack<Integer> stack = nextGreatestElement(arr);
        System.out.println(stack);
    }

    public static Stack<Integer> nextGreatestElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) { // Fixed index bound
                if (arr[i] < arr[j]) {
                    stack.push(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                stack.push(-1);
            }
        }
        return stack;
    }
}
