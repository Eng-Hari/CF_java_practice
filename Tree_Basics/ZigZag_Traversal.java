package Tree_Basics;

import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class ZigZag {

    public ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int levelCount = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();

                if (levelCount % 2 == 1) {
                    level.add(temp.data);         // Odd level: left to right
                } else {
                    level.add(0, temp.data);      // Even level: right to left
                }

                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }

            result.addAll(level);
            levelCount++;
        }

        return result;
    }
}

public class ZigZag_Traversal {

    public static void main(String[] args) {
        // Sample tree:
        //        1
        //       / \
        //      2   3
        //     / \ / \
        //    4  5 6  7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ZigZag sol = new ZigZag();
        ArrayList<Integer> result = sol.zigZagTraversal(root);

        System.out.println("ZigZag Traversal:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
