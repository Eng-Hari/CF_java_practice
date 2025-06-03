package Stack_Quees;

public class Stack_using_Array {

    class Stack {

        int maxSize;
        int top;
        int[] stackArray;

        // Constructor
        Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        // Push operation
        void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack Overflow");
            } else {
                stackArray[++top] = value;
            }
        }

        // Pop operation
        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return stackArray[top--];
            }
        }

        // Peek operation
        int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                return stackArray[top];
            }
        }

        // Check if stack is empty
        boolean isEmpty() {
            return top == -1;
        }

        // Display stack
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.print("Stack elements: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(stackArray[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Stack_using_Array stackDemo = new Stack_using_Array();
        Stack stack = stackDemo.new Stack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This should show "Stack Overflow"

        // Display the stack
        stack.display();

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display the stack again
        stack.display();
    }
}
