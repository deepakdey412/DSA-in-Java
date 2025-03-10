import java.util.Arrays;
import java.util.Stack;

public class Stack_Using_Collection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        // Display stack
        System.out.println("The stack : " + stack);

        // Pop element
        System.out.println("Pop topmost element(delete) : " + stack.pop());

        // Display stack after pop
        System.out.println("The stack after popping : " + stack);

        // Peek top element
        System.out.println("Peek the topmost element " + stack.peek());

        // Insert at specific position
        stack.add(1, 100);
        System.out.println("The stack : " + stack);

        // Clear stack
        stack.clear();
        System.out.println("The stack : " + stack);

        // Search element
        System.out.println(stack.search(100)); // empty stack will return -1

        // Check if stack is empty
        System.out.println(stack.empty());

        // Add elements using push
        stack.push(7010);
        System.out.println("The stack : " + stack);

        // Convert stack to array
        Object[] isArr = stack.toArray();
        System.out.println("Stack to array " + Arrays.toString(isArr));

    }
}
