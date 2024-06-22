package com.org.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.codingninjas.com/studio/problems/remove-duplicates_920325?interviewProblemRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class RemoveDuplicates
{
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr)
	{
		// Write your code here.

		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> al = new ArrayList<>();

		arr.forEach(e ->
		{
			if(set.add(e))
			{
				al.add(e);
			}
		});
		return al;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10, 11, 23, 23, 23));
		System.out.println(RemoveDuplicates.removeDuplicates(al));
	}

}
