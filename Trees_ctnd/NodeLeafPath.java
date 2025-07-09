package Trees_ctnd;

import java.util.ArrayList;

public class NodeLeafPath {

    static class Node {

        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Recursive method to collect all root-to-leaf paths
    private void traverse(Node node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> allPaths) {
        if (node == null) {
            return;
        }

        path.add(node.data);

        if (node.left == null && node.right == null) {
            allPaths.add(new ArrayList<>(path));
        }

        traverse(node.left, path, allPaths);
        traverse(node.right, path, allPaths);

        path.remove(path.size() - 1); // backtrack
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();

        NodeLeafPath obj = new NodeLeafPath();
        obj.traverse(root, path, allPaths);  // ✅ Directly calling traverse

        System.out.println("Root to Leaf Paths:");
        for (ArrayList<Integer> p : allPaths) {
            System.out.println(p);
        }
    }
}
