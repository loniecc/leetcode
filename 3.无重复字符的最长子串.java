/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */
// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int[] result = new int[s.length()];
        result[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            result[i] = Math.max(result[i - 1], lengthReverse(s, i));
        }
        return result[s.length() - 1];
    }

    public int lengthReverse(String s, int p) {
        String tmpStr = "";
        for (int i = p; i > -1; i--) {
            if (tmpStr.contains(String.valueOf(s.charAt(i)))) {
                return tmpStr.length();
            } else {
                tmpStr += String.valueOf(s.charAt(i));
            }
        }
        return tmpStr.length();
    }
}
// @lc code=end
