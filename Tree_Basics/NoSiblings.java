package Tree_Basics;

import java.util.*;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    ArrayList<Integer> findNodesWithoutSiblings(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        findNode(node, result);

        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }
        return result;
    }

    private void findNode(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        if (node.left != null && node.right == null) {
            result.add(node.left.data);
        }

        if (node.right != null && node.left == null) {
            result.add(node.right.data);
        }

        findNode(node.left, result);
        findNode(node.right, result);
    }
}

//         37
//        /
//      20
//      /
//    113
public class NoSiblings {

    public static void main(String[] args) {
        Node root = new Node(37);
        root.left = new Node(20);
        root.left.left = new Node(113);

        BinaryTree tree = new BinaryTree();
        ArrayList<Integer> result = tree.findNodesWithoutSiblings(root);

        System.out.println("Nodes without siblings: " + result);
    }
}
