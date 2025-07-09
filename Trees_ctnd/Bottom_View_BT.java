package Trees_ctnd;

import java.util.*;

// Node class for Binary Tree
class Node {

    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Pair class to hold a Node and its horizontal distance (hd)
class Pair {

    Node node;
    int hd;

    public Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class Bottom_View_BT {

    // Function to compute the bottom view of a binary tree
    public static ArrayList<Integer> bottomView(Node root) {
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

            // Overwrite the value for this HD — keeps the bottom-most node
            map.put(hd, currNode.data); // override give last added vale 

            // Add left and right children with updated HD
            if (currNode.left != null) {
                q.offer(new Pair(currNode.left, hd - 1));
            }
            if (currNode.right != null) {
                q.offer(new Pair(currNode.right, hd + 1));
            }
        }

        // Collect values in left-to-right order from TreeMap
        for (int val : map.values()) {
            result.add(val);
        }

        return result;
    }

    // Main method to test the bottom view function
    public static void main(String[] args) {
        /*
                20
               /  \
              8    22
             / \     \
            5   3     25
               / \
              10 14

        Expected Bottom View: 5 10 3 14 25
         */

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> view = bottomView(root);

        System.out.println("Bottom View of the Binary Tree:");
        System.out.println(view); // Output: [5, 10, 3, 14, 25]
    }
}
