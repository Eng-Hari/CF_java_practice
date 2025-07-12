package Trees_ctnd;

import java.util.*;

public class Min_diss_BT {

    // Binary Tree Node class
    static class Node {

        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Main logic class
    static class GfG {

        // Build parent map and return reference to node `a`
        public static Node Findnode(Node root, int a, Map<Node, Node> parent) {
            Queue<Node> q = new LinkedList<>();
            q.offer(root);

            Node targetNode = null;

            while (!q.isEmpty()) {
                Node cur = q.poll();

                if (cur.data == a) {
                    targetNode = cur;
                }

                if (cur.left != null) {
                    parent.put(cur.left, cur);
                    q.offer(cur.left);
                }

                if (cur.right != null) {
                    parent.put(cur.right, cur);
                    q.offer(cur.right);
                }
            }

            return targetNode;
        }

        // Find minimum distance between node `a` and `b`
        int findDist(Node root, int a, int b) {
            Map<Node, Node> parent = new HashMap<>();
            Node currNode = Findnode(root, a, parent);

            Set<Node> visited = new HashSet<>();
            Queue<Node> q = new LinkedList<>();
            q.offer(currNode);
            visited.add(currNode);

            int dist = 0;

            while (!q.isEmpty()) {
                int size = q.size();

                for (int i = 0; i < size; i++) {
                    Node temp = q.poll();

                    if (temp.data == b) {
                        return dist;
                    }

                    if (temp.left != null && !visited.contains(temp.left)) {
                        visited.add(temp.left);
                        q.offer(temp.left);
                    }

                    if (temp.right != null && !visited.contains(temp.right)) {
                        visited.add(temp.right);
                        q.offer(temp.right);
                    }

                    if (parent.containsKey(temp) && !visited.contains(parent.get(temp))) {
                        visited.add(parent.get(temp));
                        q.offer(parent.get(temp));
                    }
                }

                dist++; // Level-wise distance increment
            }

            return -1; // Node b not found
        }
    }

    // Test the function
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        GfG solver = new GfG();
        int a = 4, b = 7;
        int distance = solver.findDist(root, a, b);

        System.out.println("Minimum distance between " + a + " and " + b + " is: " + distance);
    }
}
