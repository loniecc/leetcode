/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                swap(nums, slow++, fast);
            }
            fast++;
        }
    }

    private void swap(int[] data, int left, int right) {
        int tmp = data[left];
        data[left] = data[right];
        data[right] = tmp;
    }
}
// @lc code=end
