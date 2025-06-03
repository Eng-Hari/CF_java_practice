package Stack_Quees;               // Package name

import java.util.Stack;            // Importing Java Stack class

public class Queue_using_Stack {   // Class declaration

    // Two stacks: stack1 is main, stack2 is for help
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation - O(n)
    void enqueue(int data) {
        // Step 1: Move all elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Step 2: Push new data to now-empty stack1
        stack1.push(data);

        // Step 3: Move all elements back from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // Dequeue operation - O(1)
    void dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + stack1.pop()); // Front is always on top
    }

    // Returns the front element - O(1)
    int front() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack1.peek(); // Top of stack1 is the front of queue
    }

    // Check if queue is empty
    boolean isEmpty() {
        return stack1.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {
        Queue_using_Stack q = new Queue_using_Stack();

        q.enqueue(10); // Push 10
        q.enqueue(20); // Push 20
        q.enqueue(30); // Push 30

        System.out.println("Front: " + q.front()); // Should print 10
        q.dequeue();                               // Removes 10
        System.out.println("Front: " + q.front()); // Should print 20
    }
}
