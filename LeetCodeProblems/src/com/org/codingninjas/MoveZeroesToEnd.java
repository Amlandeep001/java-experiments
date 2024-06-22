package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://www.codingninjas.com/studio/problems/interview-shuriken-41-move-zeroes-to-end_240143?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class MoveZeroesToEnd
{
	public static void pushZerosAtEnd(ArrayList<Integer> arr)
	{
		// Write your code here.

		Map<String, List<Integer>> numberGroups = arr.stream()
				.collect(Collectors.groupingBy(
						item -> item == 0 ? "ZerosList" : "NonZerosList"));

		numberGroups.get("NonZerosList")
				.addAll(numberGroups.get("ZerosList"));

		System.out.println(numberGroups.get("NonZerosList"));
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 0, 4, 1, 3, 0, 28));
		MoveZeroesToEnd.pushZerosAtEnd(arr);
	}

}
