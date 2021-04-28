/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int max_flag = Integer.MAX_VALUE / 10;
        int min_flag = Integer.MIN_VALUE /10;
        int res = 0;
        while(x != 0){
            int tmp = x % 10;
            if(res > max_flag || (res == max_flag&& tmp>7)){
                return 0;
            }
            if(res < min_flag || (res < min_flag&& tmp < -8)){
                return 0;
            }
            res = res * 10 + tmp;
            x /=10;
        }
        return res;
    }
}
// @lc code=end

