/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {

        // 1. 直接循环数组，对所有数字进行平方操作
        // [错误]]2. 从中间切开数组，进行有序数组的合并
        // 2. 找到最小的那个数字，切开数组

        // 双指针两头遍历，哪个指针的平方大，哪个指针放到右侧
        int[] result = new int[nums.length];
        int pRight = nums.length - 1, pLeft = 0;
        for (int i = result.length - 1; i > -1; i--) {
            if (nums[pRight] * nums[pRight] > nums[pLeft] * nums[pLeft]) {
                result[i] = nums[pRight] * nums[pRight];
                pRight--;
            } else {
                result[i] = nums[pLeft] * nums[pLeft];
                pLeft++;
            }
        }
        return result;
    }

}
// @lc code=end
