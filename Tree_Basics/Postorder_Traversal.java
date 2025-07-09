package Tree_Basics;

import java.util.ArrayList;

// Node class
class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

// Solution class with Postorder traversal logic
class Solution {

    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrderTraversal(root, list);
        return list;
    }

    void postOrderTraversal(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left, list);   // Left
        postOrderTraversal(node.right, list);  // Right
        list.add(node.data);                   // Root
    }
}

// Main class to test Postorder traversal
public class Postorder_Traversal {

    public static void main(String[] args) {
        // Sample tree:
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

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.postOrder(root);

        System.out.println("Postorder Traversal: " + result);
    }
}
