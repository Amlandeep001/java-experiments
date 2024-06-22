package com.org.codingninjas;

//https://www.naukri.com/code360/problems/cube-sum-pairs_1060717?topList=top-array-coding-interview-questions&problemListRedirection=true&leftPanelTabValue=SUBMISSION
public class CubeSumPairs
{
	public static int countCubeSumPairs(int n)
	{
		// Write your code here.
		int count = 0;

		for(int a = 0; a * a * a <= n; a++)
		{
			int rem = n - (a * a * a);
			int cbRoot = (int) Math.cbrt(rem);

			if(cbRoot > 0 && cbRoot * cbRoot * cbRoot == rem)
			{
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		System.out.println(countCubeSumPairs(27));
	}
}
