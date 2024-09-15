package com.org.codingninjas;

//https://www.naukri.com/code360/problems/best-time-to-buy-and-sell_696432?interviewProblemRedirection=true&search=buy&leftPanelTabValue=PROBLEM&count=25&page=1&sort_entity=order&sort_order=ASC&attempt_status=NOT_ATTEMPTED&customSource=studio_nav
public class BestTimeToBuyAndSellStockII
{
    public static int maxProfit(int[] prices)
    {
        // Write your code here.

        int max_profit = 0;

        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] > prices[i - 1])
            {
                max_profit += (prices[i] - prices[i - 1]);
            }
        }
        return max_profit;
    }

    public static void main(String[] args)
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 7
    }
}
