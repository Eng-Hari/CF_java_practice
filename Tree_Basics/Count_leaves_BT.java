package Tree_Basics;

// Node class for the Binary Tree
class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

// Main class
public class Count_leaves_BT {

    // Method to count leaf nodes
    public static int countLeaves(Node node) {
        if (node == null) {
            return 0;
        }

        // A leaf node has no left and right children
        if (node.left == null && node.right == null) {
            return 1;
        }

        // Recur for left and right subtree
        return countLeaves(node.left) + countLeaves(node.right);
    }

    // Main method to test the code
    public static void main(String[] args) {
        /*
                4
              /   \
             8     10
            /     /  \
           7     5    1
          /
         3
         Leaves: 3, 5, 1
         */

        Node root = new Node(4);
        root.left = new Node(8);
        root.right = new Node(10);
        root.left.left = new Node(7);
        root.left.left.left = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(1);

        int leafCount = countLeaves(root);
        System.out.println("Number of leaf nodes: " + leafCount); // Output: 3
    }
}
