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
public class Size_of_BT {

    // Method to calculate size of binary tree
    public static int getSize(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSize(node.left) + getSize(node.right);
    }

    // Main method to test the tree
    public static void main(String[] args) {
        /*
              10
             /  \
           5     9
            \   / \
             1 3   6
         */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(9);
        root.left.right = new Node(1);
        root.right.left = new Node(3);
        root.right.right = new Node(6);

        int size = getSize(root);
        System.out.println("Size of the Binary Tree: " + size); // Output: 6
    }
}
