/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> countMap = new HashMap();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }else{
                countMap.put(c,1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)-1);
            }else{
                return false;
            }
        }

        for(Character c: countMap.keySet()){
            if(0 != countMap.get(c)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

