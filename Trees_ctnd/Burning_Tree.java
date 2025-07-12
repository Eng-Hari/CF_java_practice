package Trees_ctnd;

import java.util.*;

public class Burning_Tree {

    // Tree Node Definition
    static class Node {

        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Solver class
    static class BurningTreeSolver {

        // Helper method to build parent map and return reference to target node
        public Node markParents(Node root, int target, Map<Node, Node> parentMap) {
            Queue<Node> q = new LinkedList<>();
            q.offer(root);

            Node targetNode = null;

            while (!q.isEmpty()) {
                Node curr = q.poll();

                if (curr.data == target) {
                    targetNode = curr;
                }

                if (curr.left != null) {
                    parentMap.put(curr.left, curr);
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    parentMap.put(curr.right, curr);
                    q.offer(curr.right);
                }
            }

            return targetNode;
        }

        // Main logic to find minimum time to burn the tree
        public int minTime(Node root, int target) {
            Map<Node, Node> parentMap = new HashMap<>();
            Node start = markParents(root, target, parentMap);

            Set<Node> visited = new HashSet<>();
            Queue<Node> q = new LinkedList<>();
            q.offer(start);
            visited.add(start);

            int time = 0;

            while (!q.isEmpty()) {
                int size = q.size();
                boolean burnedNew = false;

                for (int i = 0; i < size; i++) {
                    Node curr = q.poll();

                    // Left child
                    if (curr.left != null && !visited.contains(curr.left)) {
                        visited.add(curr.left);
                        q.offer(curr.left);
                        burnedNew = true;
                    }

                    // Right child
                    if (curr.right != null && !visited.contains(curr.right)) {
                        visited.add(curr.right);
                        q.offer(curr.right);
                        burnedNew = true;
                    }

                    // Parent
                    if (parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))) {
                        visited.add(parentMap.get(curr));
                        q.offer(parentMap.get(curr));
                        burnedNew = true;
                    }
                }

                if (burnedNew) {
                    time++;
                }
            }

            return time;
        }
    }

    // Sample usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BurningTreeSolver solver = new BurningTreeSolver();
        int target = 2;
        int burnTime = solver.minTime(root, target);

        System.out.println("Minimum time to burn the tree from node " + target + " is: " + burnTime);
    }
}
