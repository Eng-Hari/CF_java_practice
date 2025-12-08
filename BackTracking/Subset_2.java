package BackTracking;

import java.util.*;

public class Subset_2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        Solution obj = new Solution();
        List<List<Integer>> result = obj.subsetsWithDup(nums);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort to handle duplicates
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            backtrack(i + 1, nums, path, result);
            path.remove(path.size() - 1); // Backtrack
        }
    }
}
