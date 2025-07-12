package Trees_ctnd;

class Node {

    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Insert_BST {

    // 🔽 Insert a node into BST
    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);  // Base case: empty tree
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;  // return unchanged root pointer
    }

    // 🔽 Inorder traversal (for checking insertion)
    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔽 Main method to test insertions
    public static void main(String[] args) {
        Insert_BST tree = new Insert_BST();
        Node root = null;

        // Insert values into the BST
        int[] values = {10, 5, 15, 3, 7, 12, 18};
        for (int val : values) {
            root = tree.insert(root, val);
        }

        // Print inorder traversal
        System.out.println("Inorder traversal of BST:");
        tree.inorder(root);  // Output should be sorted: 3 5 7 10 12 15 18
    }
}
