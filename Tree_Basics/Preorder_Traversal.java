package Tree_Basics;

import java.util.ArrayList;

class PreorderSolution {

    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        traverse(root, list);
        return list;
    }

    private void traverse(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.data);                  // Root
        traverse(node.left, list);            // Left
        traverse(node.right, list);           // Right
    }
}

public class Preorder_Traversal {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        PreorderSolution solution = new PreorderSolution();
        ArrayList<Integer> result = solution.preOrder(root);

        System.out.println("Preorder Traversal: " + result);
    }
}
