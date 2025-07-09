package Tree_Basics;

import java.util.*;

// Binary Tree Node
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Solution class for right view logic
class RVBT {

    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();

                // Add the last node of each level
                if (i == size - 1) {
                    result.add(temp.data);
                }

                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }

        return result;
    }
}

// Main test class
public class Right_View_BT {

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \   \
          4   5   6
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        RVBT sol = new RVBT();
        ArrayList<Integer> rightView = sol.rightView(root);

        System.out.println("Right View of Binary Tree: " + rightView);
    }
}
