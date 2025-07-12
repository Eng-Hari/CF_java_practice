package Trees_ctnd;

public class Find_parent {

    // Binary Tree Node class
    static class Node {

        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = this.right = null;
        }
    }

    // Function to find the parent of node with value 'k'
    public static int findParent(Node root, int k) {
        if (root == null) {
            return -1;
        }

        // Check if current node is the parent of k
        if ((root.left != null && root.left.data == k)
                || (root.right != null && root.right.data == k)) {
            return root.data;
        }

        // Search in left subtree
        int left = findParent(root.left, k);
        if (left != -1) {
            return left;
        }

        // Search in right subtree
        return findParent(root.right, k);
    }

    // ✅ Example main method for local testing
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int target = 5;
        int parent = findParent(root, target);

        if (parent != -1) {
            System.out.println("Parent of " + target + " is: " + parent);
        } else {
            System.out.println("Parent not found (either not in tree or is root)");
        }
    }
}
