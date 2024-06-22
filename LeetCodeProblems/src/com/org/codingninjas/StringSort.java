package com.org.codingninjas;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/stringsort_4605051?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&company%5B%5D=Accenture&sort_entity=recents&sort_order=DESC
public class StringSort
{
	public static String stringSort(String s)
	{
		// Write your code here.

		char[] ch = s.toCharArray();
		Arrays.sort(ch);

		return new String(ch);
	}

	public static void main(String[] args)
	{
		System.out.println(StringSort.stringSort("bcfdea"));
	}
}
