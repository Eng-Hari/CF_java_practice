package Trees_ctnd;

public class All_nodes_parent {

    // Binary Tree Node
    static class Node {

        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to print parent of all nodes
    public static void printParents(Node root) {
        // Root has no parent
        printParentRecursive(root, -1);
    }

    // Recursive helper function
    public static void printParentRecursive(Node node, int parentVal) {
        if (node == null) {
            return;
        }

        if (parentVal != -1) {
            System.out.println("Parent of " + node.data + " is " + parentVal);
        }

        // Recurse left and right with current node as parent
        printParentRecursive(node.left, node.data);
        printParentRecursive(node.right, node.data);
    }

    // Main method to test
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printParents(root);
    }
}
