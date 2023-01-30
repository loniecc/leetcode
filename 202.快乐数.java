/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    Map<Long, Boolean> resCache = new HashMap<>();
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        return isRealHappy((long)n);
    }

    public boolean isRealHappy(Long n) {
        Long result = calculate(n);
        if(1L == result){
            return true;
        }
        if(resCache.containsKey(result)){
            return resCache.get(result);
        }
        resCache.put(result, false);
        return isRealHappy(result);
    }

    private Long calculate(Long n) {
        Long sum = 0L;
        while(n > 0){
            Long number = n % 10;
            sum += (number * number);
            n = n/10;
        }
        return sum;
    }
}
// @lc code=end

