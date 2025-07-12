package Trees_ctnd;

import java.util.ArrayList;

public class Kth_Ancestor {

    static class Node {

        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static class Solution {

        public boolean findPath(Node root, int target, ArrayList<Integer> path) {
            if (root == null) {
                return false;
            }

            path.add(root.data);

            if (root.data == target) {
                return true;
            }

            boolean left = findPath(root.left, target, path);
            boolean right = findPath(root.right, target, path);

            if (!left && !right) {
                path.remove(path.size() - 1); // backtrack
                return false;
            }

            return true;
        }

        public int kthAncestor(Node root, int k, int target) {
            ArrayList<Integer> path = new ArrayList<>();
            findPath(root, target, path);

            // Remove the target node itself
            path.remove(path.size() - 1);

            // Check if k-th ancestor exists
            if (path.size() < k) {
                return -1;
            }

            return path.get(path.size() - k);
        }
    }

    public static void main(String[] args) {
        /*
                  1
                 / \
                2   3
               / \
              4   5
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int target = 5;
        int k = 2;

        Solution sol = new Solution();
        int ancestor = sol.kthAncestor(root, k, target);

        if (ancestor == -1) {
            System.out.println("No such ancestor exists.");
        } else {
            System.out.println(k + "-th ancestor of node " + target + " is: " + ancestor);
        }
    }
}
