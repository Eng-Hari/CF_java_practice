package Stack_Quees;

import java.util.ArrayList;
import java.util.Stack;

public class Next_greatest_element {

    // Make Solution class static so main can access it
    static class Solution {

        public ArrayList<Integer> nextLargerElement(int[] arr) {
            int n = arr.length;
            ArrayList<Integer> result = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();

            // Fill result with -1 initially
            for (int i = 0; i < n; i++) {
                result.add(-1);
            }

            // Traverse the array from left to right
            for (int i = 0; i < n; i++) {
                // While stack is not empty and current element is greater
                while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                    int index = stack.pop();
                    result.set(index, arr[i]); // Set next greater element
                }
                // Push current index to stack
                stack.push(i);
            }

            return result;
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {6, 8, 0, 1, 3};
        ArrayList<Integer> output = sol.nextLargerElement(input);
        System.out.println(output); // Output: [8, -1, 1, 3, -1]
    }
}
