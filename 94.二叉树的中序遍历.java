/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Stack<TreeNode> stack = new Stack();
        TreeNode pNode = root;
        while (null != pNode || !stack.isEmpty()) {
            if (null != pNode) {
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                pNode = stack.pop();
                res.add(pNode.val);
                pNode = pNode.right;
            }

        }
        return res;
    }
}
// @lc code=end
