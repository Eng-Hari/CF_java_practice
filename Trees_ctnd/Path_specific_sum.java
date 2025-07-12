package Trees_ctnd;

import java.util.*;

public class Path_specific_sum {

    // Binary Tree Node class
    static class Node {

        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = this.right = null;
        }
    }

    static class Solution {

        public static void findPaths(Node root, int targetSum, int currentSum,
                ArrayList<Integer> path,
                ArrayList<ArrayList<Integer>> allPaths) {

            if (root == null) {
                return;
            }

            // Add current node to path and update the sum
            currentSum += root.data;
            path.add(root.data);

            // If current sum equals target, store the path
            if (currentSum == targetSum) {
                allPaths.add(new ArrayList<>(path));
            }

            // Recurse left and right
            findPaths(root.left, targetSum, currentSum, path, allPaths);
            findPaths(root.right, targetSum, currentSum, path, allPaths);

            // Backtrack
            path.remove(path.size() - 1);
        }

        public static ArrayList<ArrayList<Integer>> getAllPaths(Node root, int sum) {
            ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
            findPaths(root, sum, 0, new ArrayList<>(), allPaths);
            return allPaths;
        }
    }

    // 🔽 Sample main method for testing
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        int targetSum = 22;

        ArrayList<ArrayList<Integer>> result = Solution.getAllPaths(root, targetSum);

        for (ArrayList<Integer> path : result) {
            System.out.println(path);
        }
    }
}
