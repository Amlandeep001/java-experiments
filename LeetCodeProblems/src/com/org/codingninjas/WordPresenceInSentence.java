package com.org.codingninjas;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/check-if-the-word-is-present-in-sentence-or-not_920440?topList=top-amazon-coding-interview-questions&problemListRedirection=true&count=25&page=1&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class WordPresenceInSentence
{
	public static boolean findWord(String s, String w)
	{
		// Write your code here.
		return Arrays.stream(s.split(" "))
				.anyMatch(e -> e.equals(w));
	}

	public static void main(String[] args)
	{
		String s = "welcome to coding ninjas";
		String w = "ninja";
		System.out.println(findWord(s, w));
	}
}
