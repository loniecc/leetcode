/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口，滑动窗口右侧，和大于目标时，左侧窗口收缩，小于目标时，后侧窗口扩张，记录长度
        int start =0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for(int end = 0;end < nums.length; end++){
            sum += nums[end];
            while(sum >= target){
                result = Math.min(result, end-start+1);
                sum -= nums[start];
                start++;
            }

        }
        return result == Integer.MAX_VALUE ?0 : result;


    }
}
// @lc code=end

