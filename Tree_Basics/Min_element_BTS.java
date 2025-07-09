package Tree_Basics;

// Node class representing a single node of the BST
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Class to find the minimum element in a BST
public class Min_element_BTS {

    // Function to find the minimum element in BST
    public static int minValue(Node root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return Integer.MAX_VALUE; // or throw an exception
        }

        // // Traverse to the leftmost node
        // while (root.left != null) {
        //     root = root.left;
        // }
        // or
        if (root.left == null) {
            return root.data;
        }

        // return root.data;
        return minValue(root.left);
    }

    // Sample BST creation and test
    public static void main(String[] args) {
        /*
              10
             /  \
            5   20
           / \
          2   8
         */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(8);

        int min = minValue(root);
        System.out.println("Minimum element in BST: " + min);
    }
}
