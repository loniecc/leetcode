/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {

    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length-1;

        while(left < right){
            boolean leftMin = false;
            int minHeight = height[right];
            if(height[left] < height[right]){
                leftMin = true;
                minHeight = height[left];
            }
            int tmpRes = (right - left) * minHeight;
            if(tmpRes > res){
                res = tmpRes;
            }
            if(leftMin){
                left ++;
            }else{
                right --;
            }
        }
        return res;
    }


    public int getMinNumber(int a, int b){
        return a>b?b:a;
    }

}
// @lc code=end

