package Stack_Quees;

import java.util.Stack;

public class Sort_stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Original stack: " + stack);

        // Sort the stack so that the top element is the greatest
        sortStack(stack);

        System.out.println("Sorted stack (top is greatest): " + stack);
    }

    // Recursive function to sort the stack
    public static void sortStack(Stack<Integer> s) {
        if (s.isEmpty() || s.size() == 1) {
            return; // Base case: already sorted
        }

        // Remove the top element
        int top = s.pop();

        // Recursively sort the remaining stack
        sortStack(s);

        // Insert the popped element back in the sorted stack
        insertSorted(s, top);
    }

    // Insert an element into a sorted stack
    private static void insertSorted(Stack<Integer> s, int element) {
        // If stack is empty or element is greater or equal to the top element, push it here
        if (s.isEmpty() || element >= s.peek()) {
            s.push(element);
            return;
        }

        // Otherwise, remove the top element and recurse
        int top = s.pop();
        insertSorted(s, element);

        // Put the top element back after insertion
        s.push(top);
    }
}
