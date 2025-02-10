package com.org.leetcode;

/**
 * @author Amlan
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeToBuyAndSellStock
{
    public static int maxProfit(int[] prices)
    {
        // at the beginning the minimum price is the first price
        int buying_price = prices[0];

        // at the beginning the minimum profit is zero
        int profit = 0;

        for (int i = 1; i < prices.length; i++)
        {
            // if the current price is less, update the buying price
            if (prices[i] < buying_price)
            {
                buying_price = prices[i];
            }
            else
            {
                // check if we can get a better profit
                int current_profit = prices[i] - buying_price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args)
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // 5
    }
}
