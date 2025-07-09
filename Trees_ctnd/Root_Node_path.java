package Trees_ctnd;

import java.util.ArrayList;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Root_Node_path {

    // Function to find the path from root to the target node
    public boolean Findpath(Node root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return false;
        }

        path.add(root.data);  // ✅ Fix: add current node's data

        if (root.data == target) {
            return true;
        }

        if (Findpath(root.left, target, path) || Findpath(root.right, target, path)) {
            return true;
        }

        // Backtrack
        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> path = new ArrayList<>();
        Root_Node_path tree = new Root_Node_path();
        boolean found = tree.Findpath(root, 5, path);

        if (found) {
            System.out.println("Path: " + path);
        } else {
            System.out.println("Node not found.");
        }
    }
}
