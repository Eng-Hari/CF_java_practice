package Stack_Quees; // Package name

import java.util.LinkedList; // Import LinkedList for queue implementation
import java.util.Queue;

public class Stack_using_Queue {

    // Define a static nested class for stack implementation
    public static class StackUsingQueue {

        // q1 is the main queue that always holds the current stack elements
        Queue<Integer> q1 = new LinkedList<>();

        // q2 is a helper queue used during push operations
        Queue<Integer> q2 = new LinkedList<>();

        // Push operation (costly)
        void push(int x) {
            // Step 1: Push new element into q2
            q2.add(x);

            // Step 2: Move all existing elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Step 3: Swap q1 and q2 to make q1 the main queue again
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Pop operation (efficient)
        void pop() {
            // If the queue is empty, show a message
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            // Remove the front of q1, which is the top of the stack
            q1.remove();
        }

        // Top operation (returns the top element without removing it)
        int top() {
            // If empty, return -1 and show message
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            // Return the front of q1 which represents the top of the stack
            return q1.peek();
        }

        // Checks whether the stack is empty
        boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    // Main method to test stack operations
    public static void main(String[] args) {
        // Create a stack object
        StackUsingQueue stack = new StackUsingQueue();

        // Push elements into the stack
        stack.push(10); // Stack: 10
        stack.push(20); // Stack: 20(top), 10
        stack.push(30); // Stack: 30(top), 20, 10

        // Get top element (should be 30)
        System.out.println("Top: " + stack.top());

        // Remove top element (30 removed)
        stack.pop();

        // Check the new top (should be 20)
        System.out.println("Top after pop: " + stack.top());
    }
}
