/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int[] profit = new int[prices.length-1];
        for(int i=1;i<prices.length;i++){
            profit[i-1] = prices[i] - prices[i-1];
        }
        
        int maxProfits = 0;
        for (int i=0;i<profit.length;i++){
            if(profit[i]>0){
                maxProfits += profit[i];
            }
        }
        return maxProfits;

    }
}
// @lc code=end

