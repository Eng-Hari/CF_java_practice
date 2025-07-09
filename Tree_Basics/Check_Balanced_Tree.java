package Tree_Basics;

public class Check_Balanced_Tree {

    // Binary Tree Node class
    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    // CBT class to check if the tree is balanced
    static class CBT {

        public boolean isBalanced(Node root) {
            return checkHeight(root) != -1;
        }

        // Helper function to return height or -1 if unbalanced
        private int checkHeight(Node node) {
            if (node == null) {
                return 0;
            }

            int left = checkHeight(node.left);
            if (left == -1) {
                return -1;
            }

            int right = checkHeight(node.right);
            if (right == -1) {
                return -1;
            }

            if (Math.abs(left - right) > 1) {
                return -1;
            }

            return 1 + Math.max(left, right);
        }
    }

    // Driver code
    public static void main(String[] args) {
        // Creating sample tree:
        /*
                1
               / \
              2   3
             /
            4
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        CBT sol = new CBT();
        boolean result = sol.isBalanced(root);

        System.out.println("Is the tree balanced? " + result);
    }
}
