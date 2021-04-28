
/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
import java.util.*;
import java.util.function.Supplier;

import jdk.nashorn.internal.objects.annotations.Function;

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), -1);
            } else {
                count.put(s.charAt(i), i);
            }
        }
        for (Character key : count.keySet()) {
            if (count.get(key) > -1) {
                return count.get(key);
            }
        }
        return -1;
    }
}
// @lc code=end
