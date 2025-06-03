package Stack_Quees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_first_K_queue {

    static class Solution {

        public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
            if (q == null || k > q.size() || k <= 0) {
                return q; // No change needed for invalid k
            }

            Stack<Integer> stack = new Stack<>();

            // Step 1: Dequeue first k elements and push them onto the stack
            for (int i = 0; i < k; i++) {
                stack.push(q.poll());
            }

            // Step 2: Enqueue back the stack elements (reversed order)
            while (!stack.isEmpty()) {
                q.add(stack.pop());
            }

            // Step 3: Move the remaining elements from front to back to maintain order
            int size = q.size();
            for (int i = 0; i < size - k; i++) {
                q.add(q.poll());
            }

            return q;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;

        System.out.println("Original queue: " + queue);
        Queue<Integer> result = sol.reverseFirstK(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + result);
    }
}
