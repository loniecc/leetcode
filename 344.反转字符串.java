/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        for(int i =0;i < s.length/2;i++){
            char tc = s[i];
            s[i] = s[s.length -1 - i];
            s[s.length -1 - i] = tc;
        }
    }
}
// @lc code=end

