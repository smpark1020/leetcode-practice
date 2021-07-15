package leetcode.interview.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * LeetCode
 * 94. Binary Tree Inorder Traversal
 * Tree
 */
public class Q94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = stack.pop();
            resultList.add(currentNode.val);
            currentNode = currentNode.right;
        }

        return resultList;
    }

    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
