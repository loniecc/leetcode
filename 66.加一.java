
/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */
import java.util.*;

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        boolean plus = true;
        for (int i = digits.length - 1; i > -1; i--) {
            int digit = digits[i];
            if (plus) {
                digit += 1;
                plus = false;
            }
            if (digit > 9) {
                plus = true;
                digit = 0;
            }
            result[i + 1] = digit;

        }

        if (plus) {
            result[0] = 1;
            return result;
        } else {
            return Arrays.copyOfRange(result, 1, result.length);
        }
    }
}
// @lc code=end
