package Tree_Basics;

import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BFS {

    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                level.add(temp.data);
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }

            result.add(level);
        }

        return result;
    }
}

public class Level_Order_Traversal {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);

        root.right.right = new Node(8);
        BFS sol = new BFS();
        ArrayList<ArrayList<Integer>> result = sol.levelOrder(root);

        for (ArrayList<Integer> level : result) {
            System.out.println(level);
        }
    }
}
