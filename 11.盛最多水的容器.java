
/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        int curArea = 0;
        while (left < right) {
            curArea = (right - left) * min(height[left], height[right]);
            if (curArea > max) {
                max = curArea;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }

    private int min(int numA, int numB) {
        return numA > numB ? numB : numA;
    }

}
// @lc code=end
