package Tree_Basics;

import java.util.*;

// Node class representing each node in the binary tree
class Node {

    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

// Helper class to hold a node along with its horizontal distance (hd)
class Pair {

    Node node;
    int hd; // horizontal distance from the root

    public Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class Vertical_Tree_Traversal {

    // Function to perform vertical order traversal
    public static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // TreeMap to store vertical lines sorted by horizontal distance
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        // Result list to return
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Edge case: empty tree
        if (root == null) {
            return result;
        }

        // Queue to perform level order traversal and keep track of hd
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0)); // Root is at horizontal distance 0

        // BFS traversal
        while (!q.isEmpty()) {
            Pair current = q.poll();
            Node node = current.node;
            int hd = current.hd;

            map.putIfAbsent(hd, new ArrayList<>());
            // for eaach loop inserting new value respect to key
            map.get(hd).add(node.data);

            // Add left child with hd - 1
            if (node.left != null) {
                q.offer(new Pair(node.left, hd - 1));
            }

            // Add right child with hd + 1
            if (node.right != null) {
                q.offer(new Pair(node.right, hd + 1));
            }
        }

        // Collect values from TreeMap into result list
        for (ArrayList<Integer> vertical : map.values()) {
            result.add(vertical);
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        /*
               1
              / \
             2   3
            / \ / \
           4  5 6  7
        Expected Output: [[4], [2], [1, 5, 6], [3], [7]]
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> result = verticalOrder(root);

        // Print result
        for (ArrayList<Integer> line : result) {
            System.out.println(line);
        }
    }
}
