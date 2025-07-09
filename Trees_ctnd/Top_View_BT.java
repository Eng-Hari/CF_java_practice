package Trees_ctnd;

import java.util.*;

// Binary Tree Node class
class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Helper class to track node and its horizontal distance
class Pair {

    Node node;
    int hd;

    public Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class Top_View_BT {

    // Function to return top view of binary tree from left to right
    public static ArrayList<Integer> topView(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>(); // hd -> node.data
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0)); // Start with root at hd = 0

        while (!q.isEmpty()) {
            Pair current = q.poll();
            Node currNode = current.node;
            int hd = current.hd;
            // only once -> like hd = 0 for once hd =1 for once
            // Store the first node at this hd (top view)
            if (!map.containsKey(hd)) {
                map.put(hd, currNode.data);
            }

            // Add left and right children to the queue with updated HD
            if (currNode.left != null) {
                q.offer(new Pair(currNode.left, hd - 1));
            }
            if (currNode.right != null) {
                q.offer(new Pair(currNode.right, hd + 1));
            }
        }

        // Collecting values in left-to-right top view order
        for (int value : map.values()) {
            result.add(value);
        }

        return result;
    }

    // Main method to test topView()
    public static void main(String[] args) {
        /*
               1
             /   \
            2     3
           / \     \
          4   5     6

        Top View: 4 2 1 3 6
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> view = topView(root);
        System.out.println("Top View of the Binary Tree:");
        System.out.println(view);
    }
}
