/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (null == root) {
            return res;
        }
        Stack<TreeNode> stack = new Stack();
        TreeNode pNode = root;
        while (null != pNode || !stack.isEmpty()) {
            if (null != pNode) {
                stack.push(pNode);
                res.add(0, pNode.val);
                pNode = pNode.right;
            } else {
                pNode = stack.pop();
                pNode = pNode.left;
            }
        }
        return res;
    }
}
// @lc code=end
