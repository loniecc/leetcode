
/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {

    public int maxArea(int[] height) {
        if (height == null) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = (right - left) * (height[left] > height[right] ? height[right--] : height[left++]);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

}
// @lc code=end
