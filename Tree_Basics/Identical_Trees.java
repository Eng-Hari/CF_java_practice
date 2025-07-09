package Tree_Basics;

// Node class for the binary tree
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Identical_Trees {

    // Function to check if two trees are identical
    public static boolean isIdentical(Node root1, Node root2) {
        // If both nodes are null, they are identical
        if (root1 == null && root2 == null) {
            return true;
        }

        // If one is null and the other is not, they are not identical
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check current node data and recurse on left and right
        return (root1.data == root2.data)
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    // Test the function
    public static void main(String[] args) {
        // Tree 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        // Tree 2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        // Tree 3 (not identical)
        Node root3 = new Node(1);
        root3.left = new Node(3);
        root3.right = new Node(2);

        System.out.println("Tree 1 and Tree 2 identical? " + isIdentical(root1, root2)); // true
        System.out.println("Tree 1 and Tree 3 identical? " + isIdentical(root1, root3)); // false
    }
}
