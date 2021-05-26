
/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
import java.util.*;

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 1) {
            return 0;
        }
        int length = s.length();
        int[] result = new int[26];
        for (int i = 0; i < length; i++) {
            result[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < length; i++) {
            if (result[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
// @lc code=end
