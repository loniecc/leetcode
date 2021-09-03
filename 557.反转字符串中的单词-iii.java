/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] subStr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < subStr.length - 1; i++) {
            sb.append(reverseStr(subStr[i].toCharArray())).append(" ");
        }

        sb.append(reverseStr(subStr[subStr.length - 1].toCharArray()));
        return sb.toString();
    }

    public String reverseStr(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(s);
    }

}
// @lc code=end
