package com.org.leetcode;

//https://leetcode.com/problems/palindrome-number/submissions/1088621317/
public class IsPalindrome
{
	public boolean isPalindrome(int x)
	{
		String s = String.valueOf(x);
		/*String ns = "";
		
		char ch;
		
		for(int i = 0; i < s.length(); i++)
		{
			ch = s.charAt(i);
			ns = ch + ns;
		}
		
		if(s.equals(ns))
		{
			return true;
		}
		else
		{
			return false;
		}*/

		StringBuilder sb = new StringBuilder(s).reverse();

		if(s.equals(sb.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		IsPalindrome ip = new IsPalindrome();
		System.out.println(ip.isPalindrome(121));
	}

}
