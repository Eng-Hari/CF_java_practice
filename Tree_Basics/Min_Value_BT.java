package Tree_Basics;

import java.util.*;

// Binary Tree Node class
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Class with method to find minimum value using Level Order Traversal
class BT {

    public int findMin(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int min = root.data;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node current = q.poll();

            if (current.data < min) {
                min = current.data;
            }

            if (current.left != null) {
                q.offer(current.left);
            }
            if (current.right != null) {
                q.offer(current.right);
            }
        }

        return min;
    }
}

// Main test class
public class Min_Value_BT {

    public static void main(String[] args) {
        /*
              10
             /  \
           20    5
          / \     \
         30  1     8
         */

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(5);
        root.left.left = new Node(30);
        root.left.right = new Node(1);
        root.right.right = new Node(8);

        BT tree = new BT();
        int minValue = tree.findMin(root);

        System.out.println("Minimum value in the Binary Tree: " + minValue);
    }
}
