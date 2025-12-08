package Trees_ctnd;

class Node {

    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {

    int ans;

    public int maxPathSum(Node root) {
        ans = Integer.MIN_VALUE;
        int res = postOrder(root);

        if (root.left == null || root.right == null) {
            return Math.max(ans, res);
        }

        return ans;
    }

    int postOrder(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);

        if (root.left == null) {
            return rightSum + root.data;
        }
        if (root.right == null) {
            return leftSum + root.data;
        }

        int totalPath = leftSum + rightSum + root.data;
        ans = Math.max(ans, totalPath);

        return Math.max(leftSum, rightSum) + root.data;
    }
}

public class Max_path_sum {

    public static void main(String[] args) {
        // Constructing the binary tree
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        Solution sol = new Solution();
        int result = sol.maxPathSum(root);
        System.out.println("Maximum Path Sum Between Two Leaves: " + result);
    }
}
