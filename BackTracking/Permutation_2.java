package BackTracking;

import java.util.*;

public class Permutation_2 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};  // Input array with duplicates
        Sol sol = new Sol();
        List<List<Integer>> result = sol.permuteUnique(nums);  // Call permutation method

        System.out.println("Unique Permutations:");
        for (List<Integer> list : result) {
            System.out.println(list);  // Print each unique permutation
        }
    }

    static class Sol {

        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(nums); // ✅ Sorting is crucial to detect duplicates during iteration

            boolean[] visited = new boolean[nums.length];  // Tracks which indices are already included in the path
            backtrack(nums, new ArrayList<>(), visited, result);
            return result;
        }

        private void backtrack(int[] nums, List<Integer> path, boolean[] visited, List<List<Integer>> result) {
            if (path.size() == nums.length) {
                result.add(new ArrayList<>(path));
                return;
            }

            for (int i = 0; i < nums.length; i++) {
                if (visited[i]) {
                    continue;
                }
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                    continue;
                }

                visited[i] = true;
                path.add(nums[i]);
                backtrack(nums, path, visited, result);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }
}
