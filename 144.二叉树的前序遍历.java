/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Stack<TreeNode> stack = new Stack();
        TreeNode pNode = root;
        while (null != pNode || !stack.isEmpty()) {
            if (null != pNode) {
                res.add(pNode.val);
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                pNode = stack.pop();
                pNode = pNode.right;
            }
        }
        return res;
    }
}
// @lc code=end
