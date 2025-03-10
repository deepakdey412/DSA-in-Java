package Basic_stack_problems;

import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(101);
        stack.push(102);
        stack.push(100);
        System.out.println("Original Stack: " + stack);

        Stack<Integer> stack02 = copyStack(stack);
        System.out.println("Copied Stack  : " + stack02);
    }

    public static Stack<Integer> copyStack(Stack<Integer> original) {
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> copiedStack = new Stack<>();

        // Step 1: Move all elements to tempStack (reversing order)
        while (!original.isEmpty()) {
            tempStack.push(original.pop());
        }

        // Step 2: Move back to both original and copied stack (restoring order)
        while (!tempStack.isEmpty()) {
            int val = tempStack.pop();
            original.push(val);
            copiedStack.push(val);
        }

        return copiedStack;
    }
}
