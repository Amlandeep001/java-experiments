package com.org.codingninjas;

//https://www.codingninjas.com/studio/problems/longest-common-substring_1235207?interviewProblemRedirection=true&leftPanelTabValue=SUBMISSION
public class LongestCommonSubstring
{
	public static int lcs(String str1, String str2)
	{
		// Write your code here.

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		int[][] dp = new int[ch1.length + 1][ch2.length + 1];

		int max = 0;

		// Iterate over each position in the matrix
		for(int i = 1; i <= ch1.length; i++)
			for(int j = 1; j <= ch2.length; j++)

				// If characters are equal
				if(ch1[i - 1] == ch2[j - 1])
				{
					// Get the number from diagonally opposite
					// and add 1
					dp[i][j] = dp[i - 1][j - 1] + 1;

					max = Math.max(dp[i][j], max);
				}

		return max;
	}

	public static void main(String[] args)
	{
		System.out.println(LongestCommonSubstring.lcs("wasdijkl", "wsdjkl"));
	}
}
