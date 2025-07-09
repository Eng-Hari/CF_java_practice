package Tree_Basics;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Sum_of_BT {

    // Function to return sum of all nodes of a binary tree
    public static int sumBT(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumBT(root.left) + sumBT(root.right);
    }

    public static void main(String[] args) {
        /*
             Tree:
                   10
                 /   \
               20     30
             /   \
           40     60
         */
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        int sum = sumBT(root);
        System.out.println("Sum of all nodes: " + sum);  // Output: 160
    }
}
