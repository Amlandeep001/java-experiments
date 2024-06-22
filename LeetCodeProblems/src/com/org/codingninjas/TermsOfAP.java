package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.naukri.com/code360/problems/terms-of-ap_893269?topList=tcs-interview-questions&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class TermsOfAP
{
	public static int[] termsOfAP(int x)
	{
		// Write your code here.

		List<Integer> result = new ArrayList<>();
		int n = 1;

		while (result.size() < x)
		{
			int term = 3 * n + 2;
			if(term % 4 != 0)
			{
				result.add(term);
			}
			n++;
		}

		return result.stream()
				.mapToInt(Integer::intValue)
				.toArray();
	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(termsOfAP(4)));
	}
}
