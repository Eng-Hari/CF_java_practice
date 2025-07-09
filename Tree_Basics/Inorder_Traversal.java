package Tree_Basics;

import java.util.ArrayList;

// Inorder solution logic
class InorderSolution {

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderTraversal(root, list);
        return list;
    }

    void inOrderTraversal(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, list);   // Left
        list.add(node.data);                 // Root
        inOrderTraversal(node.right, list);  // Right
    }
}

// Main class
public class Inorder_Traversal {

    public static void main(String[] args) {
        // Sample Tree:
        //       1
        //     /   \
        //    2     3
        //   / \
        //  4   5

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        InorderSolution solution = new InorderSolution();
        ArrayList<Integer> result = solution.inOrder(root);

        System.out.println("Inorder Traversal: " + result);
    }
}
