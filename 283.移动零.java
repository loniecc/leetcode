/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int slowPointer = 0, fastPointer = 0;
        while (fastPointer < nums.length) {
            if (nums[fastPointer] != 0) {
                swap(nums, slowPointer, fastPointer);
                slowPointer++;
            }
            fastPointer++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

}
// @lc code=end
