package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/sort-big-list-dates_1806890?topList=infosys-interview-questions&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=2&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class SortBigListDates
{
	public static int[][] sortBigListDates(int[][] dates)
	{
		// Write your code here

		/*Comparator<int[]> dateComparator = (date1, date2) ->
		{
			if(date1[2] != date2[2])
			{
				return Integer.compare(date1[2], date2[2]); // Compare years
			}
			else if(date1[1] != date2[1])
			{
				return Integer.compare(date1[1], date2[1]); // Compare months
			}
			else
			{
				return Integer.compare(date1[0], date2[0]); // Compare days
			}
		};
		
		// Sorting the dates array using the custom comparator
		Arrays.sort(dates, dateComparator);*/

		Arrays.sort(dates, (date1, date2) ->
		{
			if(date1[2] != date2[2])
			{
				return Integer.compare(date1[2], date2[2]); // Compare years
			}
			else if(date1[1] != date2[1])
			{
				return Integer.compare(date1[1], date2[1]); // Compare months
			}
			else
			{
				return Integer.compare(date1[0], date2[0]); // Compare days
			}
		});

		return dates;
	}

	public static void main(String[] args)
	{
		int[][] dates = {{13, 6, 2007}, {2, 6, 2001}, {10, 8, 2019}, {1, 6, 2007}};

		sortBigListDates(dates);

		System.out.println("Sorted Order of Dates:");
		for(int[] date : dates)
		{
			System.out.println(Arrays.toString(date));
		}
	}
}
