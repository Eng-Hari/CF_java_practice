package BackTracking;

import java.util.*;

public class CombinationSum3 {

    public static void main(String[] args) {
        // ✅ Fixed inputs for testing locally
        int k = 3;  // We need to pick 3 numbers
        int n = 9;  // Their sum should be 9

        // Call the main function and get the result
        List<List<Integer>> result = combinationSum3(k, n);

        // Print the output
        System.out.println("Valid combinations for k = " + k + " and target = " + n + ":");
        for (List<Integer> combo : result) {
            System.out.println(combo);
        }
    }

    // Main function to generate combinations
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        // Start from number 1, backtrack recursively
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    /**
     * Backtracking function to explore all combinations
     *
     * start The current number to consider (we go from 1 to 9) k Total numbers
     * we need in the combination target Remaining sum to reach path Current
     * list of numbers selected result Final result list containing valid
     * combinations
     */
    private static void backtrack(int start, int k, int target, List<Integer> path, List<List<Integer>> result) {
        // ✅ Base case: If path has k numbers and target is exactly 0, it's a valid combo
        if (path.size() == k && target == 0) {
            result.add(new ArrayList<>(path));  // Add a copy to avoid reference issue
            return;
        }

        // ❌ If we exceed size or go below 0, stop exploring
        if (path.size() > k || target < 0) {
            return;
        }

        // ✅ Try all numbers from 'start' to 9 (since only numbers 1 to 9 allowed)
        for (int i = start; i <= 9; i++) {
            path.add(i); // Choose current number
            backtrack(i + 1, k, target - i, path, result); // Recurse with updated parameters
            path.remove(path.size() - 1); // Backtrack: remove last added number
        }
    }
}
