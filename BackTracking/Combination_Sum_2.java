package BackTracking;

import java.util.*;

public class Combination_Sum_2 {

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        Solution obj = new Solution();
        List<List<Integer>> result = obj.combinationSum2(candidates, target);

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] candidates, int target, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break; // Prune the branch
            }
            path.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], path, result); // i+1 since reuse not allowed
            path.remove(path.size() - 1); // Backtrack
        }
    }
}
