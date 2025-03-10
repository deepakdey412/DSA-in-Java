class StackArray {  // No "public" here
    private int[] stack;
    private int top;
    private int capacity;

    public StackArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed into stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class Stack_Using_Array {  // Main class is public now
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
    }
}
