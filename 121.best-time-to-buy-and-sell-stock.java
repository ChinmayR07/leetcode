/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

        int minSoFar = prices[0];
        int maxprof = 0;

        for(int i = 0; i < prices.length; i++){

            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxprof = Math.max(maxprof, profit);

        }
        
        return maxprof;
        
    }
}
// @lc code=end

