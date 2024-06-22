package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://www.codingninjas.com/studio/problems/majority-element-ii_893027?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class MajorityElementII
{
	public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
	{
		// Write your code here.
		int N = arr.size();
		ArrayList<Integer> majorArrayList = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();

		arr.forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));

		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() > N / 3)
			{
				majorArrayList.add(entry.getKey());
			}
		}

		return majorArrayList;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 2, 1, 5, 2, 3));

		System.out.println(MajorityElementII.majorityElementII(arr));
	}
}
