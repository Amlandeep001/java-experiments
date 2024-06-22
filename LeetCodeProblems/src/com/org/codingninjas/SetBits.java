package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/set-bits_1164179?topic=bit-manipulation&interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=set&sort_entity=order&sort_order=ASC&customSource=studio_nav&attempt_status=COMPLETED
public class SetBits
{
	public static int countSetBits(int n)
	{
		// Write your code here.

		String str = Integer.toBinaryString(n);

		return (int) Arrays.stream(str.split(""))
				.filter(e -> e.equals("1"))
				.count();
	}
}
