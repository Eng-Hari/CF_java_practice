package Trees_ctnd;

// Node class for BST
class Node {

    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}

public class Absolute_diff {

    // ✅ Function to find the least absolute difference
    public static int minDiff(Node root, int k) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if (root.data == k) {
            return 0;
        }

        int diff = Math.abs(root.data - k);

        if (k < root.data) {
            return Math.min(diff, minDiff(root.left, k));  // Go left for smaller values
        } else {
            return Math.min(diff, minDiff(root.right, k)); // Go right for larger values
        }
    }

    // ✅ Utility method to insert node into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // ✅ Driver main to test
    public static void main(String[] args) {
        Node root = null;
        int[] values = {10, 5, 15, 3, 7, 12, 17};
        for (int val : values) {
            root = insert(root, val);
        }

        int k = 13;
        System.out.println("Minimum absolute difference with " + k + " is: " + minDiff(root, k));
        // Expected output: 1 (closest node is 12 or 15)
    }
}
