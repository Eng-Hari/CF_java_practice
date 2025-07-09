package Tree_Basics;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Count_non_leaf_nodes {

    // Function to count non-leaf nodes
    public static int countNonLeaf(Node root) {
        if (root == null) {
            return 0;
        }

        // If it's a leaf node, don't count it
        if (root.left == null && root.right == null) {
            return 0;
        }

        // Count this node + recurse on left and right
        return 1 + countNonLeaf(root.left) + countNonLeaf(root.right);
    }

    public static void main(String[] args) {
        /*
               10
             /    \
           5       20
         /   \    /   \
        3     7  15   25
        Expected output: 3 (non-leaf nodes are 10, 5, 20)
         */
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        int count = countNonLeaf(root);
        System.out.println("Count of non-leaf nodes: " + count);  // Output: 3
    }
}
