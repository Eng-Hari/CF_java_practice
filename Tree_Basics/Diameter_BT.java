package Tree_Basics;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    int total = 0;

    int diameter(Node root) {
        Height(root);
        return total;
    }

    private int Height(Node node) {
        if (node == null) {
            return 0;
        }

        int left = Height(node.left);
        int right = Height(node.right);

        int Maxdia = left + right; // diameter in edges
        total = Math.max(total, Maxdia);

        return 1 + Math.max(left, right);
    }
}

public class Diameter_BT {

    public static void main(String[] args) {
        // Sample Tree:
        //      1
        //     / \
        //    2   3
        //   /
        //  4

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        Solution sol = new Solution();
        int result = sol.diameter(root);

        System.out.println("Diameter of Binary Tree (in edges): " + result); // Output: 3
    }
}
