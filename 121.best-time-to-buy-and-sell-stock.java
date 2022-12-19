/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

            int maxprof = 0;
            int buyPrice = Integer.MAX_VALUE;

            for(int i = 0; i < prices.length; i++){

                if(buyPrice < prices[i]){
                    int profit = prices[i] - buyPrice;
                    maxprof = Math.max(maxprof, profit);
                } else {
                    buyPrice = prices[i];
                }

            }


        return maxprof;
        
    }
}
// @lc code=end

