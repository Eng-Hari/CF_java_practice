package BackTracking;

public class Subset_sum {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        boolean result = isSubsetSum(arr, target);
        System.out.println("Subset Sum result: " + result);
    }

    // This function checks if any subset of 'arr' adds up to the given 'target'
    public static boolean isSubsetSum(int[] arr, int target) {
        // Start backtracking from index 0
        return backtrack(0, arr, target);
    }

    // Backtracking function to explore subsets
    private static boolean backtrack(int index, int[] arr, int target) {
        // ✅ Base Case 1: If target becomes 0 → we found a valid subset
        if (target == 0) {
            return true;
        }

        // ❌ Base Case 2: If we reached end of array or target is negative → invalid path
        if (index == arr.length || target < 0) {
            return false;
        }

        // 🔽 Include the current element at index
        // We move to index + 1 because each number can be used only once
        if (backtrack(index + 1, arr, target - arr[index])) {
            return true; // if we found a valid subset down this path, return true
        }

        // 🔼 Exclude the current element and move to the next
        if (backtrack(index + 1, arr, target)) {
            return true; // if we find a valid subset in this path
        }

        // ⚠️ If neither including nor excluding gives a valid result, return false
        return false;
    }
}
