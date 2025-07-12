package Trees_ctnd;

import java.util.*;

public class Node_k_distance_BT {

    // Node class definition
    static class Node {

        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    static class Solution {

        // Step 1: Build parent map and find the target node
        private Node findTargetAndBuildParentMap(Node root, int target, Map<Node, Node> parentMap) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            Node targetNode = null;

            while (!queue.isEmpty()) {
                Node current = queue.poll();

                if (current.data == target) {
                    targetNode = current;
                }

                if (current.left != null) {
                    parentMap.put(current.left, current);
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    parentMap.put(current.right, current);
                    queue.offer(current.right);
                }
            }

            return targetNode;
        }

        // Step 2: Find all nodes at distance k
        public ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {
            Map<Node, Node> parentMap = new HashMap<>();
            Node targetNode = findTargetAndBuildParentMap(root, target, parentMap);

            ArrayList<Integer> result = new ArrayList<>();
            Set<Node> visited = new HashSet<>();
            Queue<Node> queue = new LinkedList<>();

            queue.offer(targetNode);
            visited.add(targetNode);

            int currentLevel = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();

                if (currentLevel == k) {
                    break;
                }

                for (int i = 0; i < size; i++) {
                    Node current = queue.poll();

                    if (current.left != null && !visited.contains(current.left)) {
                        visited.add(current.left);
                        queue.offer(current.left);
                    }

                    if (current.right != null && !visited.contains(current.right)) {
                        visited.add(current.right);
                        queue.offer(current.right);
                    }

                    if (parentMap.containsKey(current) && !visited.contains(parentMap.get(current))) {
                        visited.add(parentMap.get(current));
                        queue.offer(parentMap.get(current));
                    }
                }

                currentLevel++;
            }

            while (!queue.isEmpty()) {
                result.add(queue.poll().data);
            }

            Collections.sort(result);  // Sort result as required
            return result;
        }
    }

    public static void main(String[] args) {
        /*
                Constructed Binary Tree:
                        3
                       / \
                      5   1
                     / \ / \
                    6  2 0  8
                      / \
                     7   4
            Target = 5, k = 2
            Expected Output: [1, 4, 7]
         */
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        int target = 5;
        int k = 2;

        Solution sol = new Solution();
        ArrayList<Integer> result = sol.KDistanceNodes(root, target, k);

        System.out.println("Nodes at distance " + k + " from target " + target + ": " + result);
    }
}
