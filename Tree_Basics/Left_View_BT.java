package Tree_Basics;

import java.util.*;

// Node definition
class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

// Solution with left view logic
class LVBT {

    public ArrayList<Integer> leftView(Node root) {
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

                if (i == 0) {
                    result.add(q.peek().data);
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

// Main class
public class Left_View_BT {

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

        LVBT sol = new LVBT();
        ArrayList<Integer> leftView = sol.leftView(root);

        System.out.println("Left View of Binary Tree: " + leftView);
    }
}
