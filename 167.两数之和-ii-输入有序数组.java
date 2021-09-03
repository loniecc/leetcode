/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] result = new int[2];
        while (left < right) {
            int curSum = numbers[left] + numbers[right];
            if (target == curSum) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (target > curSum) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
// @lc code=end
