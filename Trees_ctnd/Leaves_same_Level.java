package Trees_ctnd;

import java.util.*;

// Binary Tree Node
class TreeNode {

    int data;
    TreeNode left, right;

    TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

// Helper class to store a node along with its level
class TreePair {

    TreeNode node;
    int level;

    TreePair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

public class Leaves_same_Level {

    // Function to check if all leaves are at the same level
    public static boolean checkLeavesAtSameLevel(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreePair> q = new LinkedList<>();
        q.offer(new TreePair(root, 0)); // root starts at level 0

        Integer leafLevel = null; // stores the level of the first found leaf

        while (!q.isEmpty()) {
            TreePair current = q.poll();
            TreeNode currentNode = current.node;
            int level = current.level;

            // If it's a leaf node
            if (currentNode.left == null && currentNode.right == null) {
                if (leafLevel == null) {
                    leafLevel = level;
                } else if (!leafLevel.equals(level)) {
                    return false;
                }
            }

            // Add children to queue
            if (currentNode.left != null) {
                q.offer(new TreePair(currentNode.left, level + 1));
            }
            if (currentNode.right != null) {
                q.offer(new TreePair(currentNode.right, level + 1));
            }
        }

        return true; // all leaves are at the same level
    }

    // Test the logic with a main method
    public static void main(String[] args) {
        /*
                10
               /  \
             20    30
            /  \
          10   15
         */
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(20);
        root1.right = new TreeNode(30);
        root1.left.left = new TreeNode(10);
        root1.left.right = new TreeNode(15);

        System.out.println("All leaves at same level? " + checkLeavesAtSameLevel(root1)); // false

        /*
                1
               / \
              2   3
         */
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println("All leaves at same level? " + checkLeavesAtSameLevel(root2)); // true
    }
}
