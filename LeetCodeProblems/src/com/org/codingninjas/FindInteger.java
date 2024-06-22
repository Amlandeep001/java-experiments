package com.org.codingninjas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//https://www.naukri.com/code360/problems/new-position_975266?topList=hcl-interview-questions&problemListRedirection=true&count=25&page=1&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM&customSource=studio_nav&attempt_status=ATTEMPTED
public class FindInteger
{
	public static int findInteger(int n, int k)
	{
		// Write your code here

		Map<Boolean, List<Integer>> map = IntStream.rangeClosed(1, n)
				.boxed()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		List<Integer> list = map.get(false);
		list.addAll(map.get(true));

		return list.get(k - 1);
	}

	public static void main(String[] args)
	{
		System.out.println(findInteger(7, 4));
	}

}
