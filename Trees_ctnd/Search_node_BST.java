package Trees_ctnd;

class Node {

    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}

public class Search_node_BST {

    // Function to insert nodes into the BST
    public Node insert(Node root, int val) {
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

    // Function to search a node in BST
    public boolean search(Node root, int x) {
        if (root == null) {
            return false;
        }

        if (root.data == x) {
            return true; 
        }else if (x < root.data) {
            return search(root.left, x); 
        }else {
            return search(root.right, x);
        }
    }

    public static void main(String[] args) {
        Search_node_BST tree = new Search_node_BST();
        Node root = null;

        // Inserting elements into BST
        int[] values = {10, 5, 15, 3, 7, 12, 17};
        for (int val : values) {
            root = tree.insert(root, val);
        }

        // Searching values
        int x1 = 7, x2 = 20;
        System.out.println("Is " + x1 + " present? " + tree.search(root, x1));  // true
        System.out.println("Is " + x2 + " present? " + tree.search(root, x2));  // false
    }
}
