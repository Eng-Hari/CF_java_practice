package BackTracking;

import java.util.*;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    // Backtracking function to build all subsets
    private static void backtrack(int index, int[] nums, List<Integer> path, List<List<Integer>> result) {
        //  Add the current path as a subset
        result.add(new ArrayList<>(path));

        // Loop through remaining elements to explore inclusion
        for (int i = index; i < nums.length; i++) {
            //  Include nums[i]
            path.add(nums[i]);

            //  Recurse with the next index
            backtrack(i + 1, nums, path, result);

            //  Backtrack — remove last element to try next possibility
            path.remove(path.size() - 1);
        }
    }
}
