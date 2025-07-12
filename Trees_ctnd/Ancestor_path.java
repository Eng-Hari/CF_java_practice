package Trees_ctnd;

import java.util.ArrayList;
import java.util.Collections;

public class Ancestor_path {

    static class Node {

        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    static class Solution {

        public boolean Findpath(Node root, int target, ArrayList<Integer> result) {
            if (root == null) {
                return false;
            }

            if (root.data == target) {
                return true;
            }

            result.add(root.data);

            boolean left = Findpath(root.left, target, result);
            boolean right = Findpath(root.right, target, result);

            if (!left && !right) {
                result.remove(result.size() - 1); // backtrack
                return false;
            }

            return true;
        }

        public ArrayList<Integer> Ancestors(Node root, int target) {
            ArrayList<Integer> result = new ArrayList<>();
            Findpath(root, target, result);
            Collections.reverse(result); // Ancestors from child to root
            return result;
        }
    }

    public static void main(String[] args) {
        // Constructing a sample tree:
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

        Solution sol = new Solution();
        ArrayList<Integer> ancestors = sol.Ancestors(root, target);

        System.out.println("Ancestors of " + target + ": " + ancestors);
    }
}
