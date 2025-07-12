package Trees_ctnd;

class Node {

    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class Lowest_common_Ancestor {

    static class Solution {

        Node LCA(Node root, Node n1, Node n2) {
            if (root == null) {
                return null;
            }

            if (root == n1 || root == n2) {
                return root;
            }

            Node left = LCA(root.left, n1, n2);
            Node right = LCA(root.right, n1, n2);

            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }

            return root;
        }
    }

    public static void main(String[] args) {
        // Build sample binary tree:
        /*
                  3
                 / \
                5   1
               / \   \
              6   2   8
         */
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.right = new Node(8);

        Node n1 = root.left.left;  // 6
        Node n2 = root.left.right; // 2

        Solution sol = new Solution();
        Node lca = sol.LCA(root, n1, n2);

        System.out.println("LCA of " + n1.data + " and " + n2.data + " is: " + (lca != null ? lca.data : "None"));
    }
}
