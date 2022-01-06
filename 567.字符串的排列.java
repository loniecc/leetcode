
/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */
import java.util.*;

// @lc code=start
class Solution {

    Map<String, List<String>> cacheMap = new HashMap();

    public boolean checkInclusion(String s1, String s2) {
        if (s2.contains(s1)) {
            return true;
        }
        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            charList.add(s1.charAt(i));
        }

        List<String> sortedStr = getAllSortStr(charList);
        for (int i = 0; i < sortedStr.size(); i++) {
            if (s2.contains(sortedStr.get(i))) {
                return true;
            }
        }
        return false;
    }

    public List<String> getAllSortStr(List<Character> chars) {
        List<String> result = new ArrayList<>();
        if (chars.size() == 1) {
            result.add("" + chars.get(0));
            return result;
        }
        String key = genCacheKey(chars);
        for (int i = 0; i < chars.size(); i++) {
            Character curChar = chars.get(i);
            List<String> nextRes;
            if (cacheMap.containsKey(key)) {
                nextRes = cacheMap.get(key);
            } else {
                List<Character> tmpCharList = new ArrayList<>(chars);
                tmpCharList.remove(curChar);
                nextRes = getAllSortStr(tmpCharList);
                cacheMap.put(key, nextRes);
            }

            for (String s : nextRes) {
                result.add(curChar + s);
            }
        }

        return result;
    }

    private String genCacheKey(List<Character> chars) {
        String s = "";
        for (char c : chars) {
            s += c;
        }
        return s;
    }

}
// @lc code=end
