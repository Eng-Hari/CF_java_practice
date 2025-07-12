package Trees_ctnd;

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class K_sum_Path {

    public static int findK(Node root, int k) {
        if (root == null) {
            return 0;
        }

        // Count paths starting from this node
        int Fromnode = countFromNode(root, k);

        // Recurse on left and right subtrees
        int Fromleft = findK(root.left, k);
        int Fromright = findK(root.right, k);

        return Fromnode + Fromleft + Fromright;
    }

    public static int countFromNode(Node root, int k) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        if (root.data == k) {
            count++;
        }

        count += countFromNode(root.left, k - root.data);
        count += countFromNode(root.right, k - root.data);

        return count;
    }

    // 🔽 Example main method to test
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(1);

        int k = 3;
        int result = findK(root, k);
        System.out.println("Total paths with sum " + k + ": " + result);
    }
}
