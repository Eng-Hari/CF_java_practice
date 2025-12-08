package BackTracking;

import java.util.*;

public class Combination_sum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);

        System.out.println("All combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] candidates, int target, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path)); // valid combination found
            return;
        }

        if (index == candidates.length || target < 0) {
            return; // no valid combination
        }

        // Pick current candidate (can reuse, so index stays the same)
        path.add(candidates[index]);
        backtrack(index, candidates, target - candidates[index], path, result);
        path.remove(path.size() - 1); // backtrack

        // Skip current candidate
        backtrack(index + 1, candidates, target, path, result);
    }
}
