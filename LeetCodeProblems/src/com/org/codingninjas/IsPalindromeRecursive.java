package com.org.codingninjas;

//https://www.naukri.com/code360/problems/check-palindrome-recursive_10871902?topList=ninjas-sde-sheet&problemListRedirection=true&leftPanelTabValue=PROBLEM&count=25&page=1&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav
public class IsPalindromeRecursive
{
	public static boolean isPalindrome(String str)
	{
		// Write your code here.

		return isPalindrome(str, 0);
	}

	public static boolean isPalindrome(String s, int i)
	{
		if(i > s.length() / 2)
		{
			return true;
		}

		return s.charAt(i) == s.charAt(s.length() - i - 1) && isPalindrome(s, i + 1);
	}

	public static void main(String[] args)
	{
		System.out.println(isPalindrome("abba"));
	}
}
