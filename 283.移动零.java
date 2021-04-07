/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // 快慢指针，慢指针记录左侧不为0 ，快指针向后扫描
        // if (nums.length == 1) {
        // return;
        // }

        int slowIndex = 0, tmpIndex = 0;

        while (tmpIndex < nums.length) {
            if (nums[slowIndex] != 0) {
                slowIndex++;
            }
            tmpIndex++;
        }
        int fastIndex = slowIndex + 1;
        while (fastIndex < nums.length) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex++] = nums[fastIndex];
                nums[fastIndex] = 0;
            }
            fastIndex++;
        }

        // 把所有不为0 的往前挪
        // for (int i = -1; i < nums.length - 1;) {
        // boolean change = false;
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[j] == 0) {
        // continue;
        // } else {
        // nums[++i] = nums[j];
        // if (i < j) {
        // nums[j] = 0;
        // }
        // change = true;
        // break;
        // }
        // }
        // if (!change) {
        // return;
        // }
        // }

    }
}
// @lc code=end
