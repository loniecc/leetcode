
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
import java.util.*;

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sub = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sub.containsKey(nums[i])) {
                return new int[] { i, sub.get(nums[i]) };
            }
            sub.put(target - nums[i], i);
        }
        return new int[] {};
    }
}
// @lc code=end
