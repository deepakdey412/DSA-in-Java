package Basic_stack_problems;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            stack.push(i * 10);
        }
        System.out.println("The intital Stack " + stack);
        System.out.println(stack.size());

        //Method 01
        System.out.println("Method 01 : ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();

        //Method 02
        System.out.println("Method 02 : ");
        int start = 0;
        int end = stack.size() - 1;
        while (start < end) {
            Integer temp = stack.get(start);
            stack.set(start, stack.get(end));  // Corrected: Use set() instead of stack(start)
            stack.set(end, temp);
            start++;
            end--;
        }
        System.out.println(stack);

        //Method 03
        System.out.println("Mehtod 03");
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());  // Move elements from original to temp stack
        }

        // Copy back to original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        System.out.println(stack);
    }
}
