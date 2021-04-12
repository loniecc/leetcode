/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;

        if (nums == null || nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                result = result > count ? result : count;
                count = 0;
            }
        }
        return result > count ? result : count;
    }
}
// @lc code=end
