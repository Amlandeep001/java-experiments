package com.org.codingninjas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://www.naukri.com/code360/problems/reverse-words-in-a-string_10297897?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=1
public class ReverseStringWithMoreSpaces
{
	public static String reverseString(String str)
	{
		// Write your code here
		String converted = str.trim().replaceAll("\\s+", " ");
		List<String> listStr = Arrays.asList(converted.split(" "));

		Collections.reverse(listStr);

		return String.join(" ", listStr);
	}

	public static void main(String[] args)
	{
		String str = "Welcome to Coding Ninjas";
		System.out.println(reverseString(str));
	}
}
