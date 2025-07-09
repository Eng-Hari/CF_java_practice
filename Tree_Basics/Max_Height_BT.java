package Tree_Basics;

// Binary Tree Node class
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Solution class to calculate maximum height of binary tree
class Solution {

    public int maxHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

// Main class
public class Max_Height_BT {

    public static void main(String[] args) {
        // Build a sample binary tree:
        //         1
        //        / \
        //       2   3
        //      /
        //     4

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        Solution sol = new Solution();
        int height = sol.maxHeight(root);

        System.out.println("Maximum height of the binary tree: " + height); // Output: 3
    }
}
