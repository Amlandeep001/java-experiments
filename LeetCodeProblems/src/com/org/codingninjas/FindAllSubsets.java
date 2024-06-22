package com.org.codingninjas;

import java.util.ArrayList;
import java.util.List;

//https://www.naukri.com/code360/problems/find-all-subsets_2041970?topic=bit-manipulation&interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=set&sort_entity=order&sort_order=ASC&customSource=studio_nav&attempt_status=COMPLETED
public class FindAllSubsets
{
	public static List<List<Integer>> findAllSubsets(int[] arr)
	{
		// Write your code here.
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		generateSubsets(arr, result, subset, 0);
		return result;
	}

	// Generate subsets by including or excluding each element starting from 'index'
	private static void generateSubsets(int[] arr, List<List<Integer>> result, List<Integer> subset, int index)
	{
		if(!subset.isEmpty())
		{
			result.add(new ArrayList<>(subset));
		}
		for(int i = index; i < arr.length; i++)
		{
			// Include the current element in the subset
			subset.add(arr[i]);
			// Recursively generate subsets starting from the next index
			generateSubsets(arr, result, subset, i + 1);
			// Exclude the current element from the subset (backtrack)
			subset.remove(subset.size() - 1);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3};
		System.out.println(findAllSubsets(arr));
	}
}
