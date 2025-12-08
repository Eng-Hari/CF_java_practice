package BackTracking;

import java.util.*;

public class Permutation {

    public static void main(String[] args) {
        // Example test input
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);

        // Print the output permutations
        System.out.println("All permutations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];  // Tracks whether an element is already used
        backtrack(nums, new ArrayList<>(), visited, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> path, boolean[] visited, List<List<Integer>> result) {
        // Base case: if path has all elements, it's a valid permutation
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));  // Add a deep copy of the path
            return;
        }

        // Try each number not yet used
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;  // Skip already used number
            }
            // Choose
            path.add(nums[i]);
            visited[i] = true;

            // Explore
            backtrack(nums, path, visited, result);

            // Unchoose (Backtrack)
            path.remove(path.size() - 1);
            visited[i] = false;
        }
    }
}
