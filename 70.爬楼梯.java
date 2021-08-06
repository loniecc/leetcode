/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (1 == n) {
            return 1;
        }
        if (2 == n) {
            return 2;
        }

        int stepOne = 1;
        int stepTwo = 2;
        int stairs = 3;
        while (stairs < n) {
            int curStep = stepOne + stepTwo;
            stepOne = stepTwo;
            stepTwo = curStep;
            stairs++;
        }
        return stepOne + stepTwo;
    }
}
// @lc code=end
