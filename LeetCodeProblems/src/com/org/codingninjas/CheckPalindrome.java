package com.org.codingninjas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPalindrome
{
	public static boolean checkPalindrome(String str)
	{
		List<String> strs = Arrays.asList(str.split(""));

		String newStr = strs.stream()
				.filter(a -> !a.chars().anyMatch(Character::isWhitespace)
						&& a.chars().allMatch(Character::isLetterOrDigit))
				.map(b -> b.toLowerCase())
				.collect(Collectors.joining());

		StringBuilder sb = new StringBuilder(newStr).reverse();

		if(newStr.equals(sb.toString()))
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
		String S = "N2 i&nJA?a& jnI2n";

		System.out.println(CheckPalindrome.checkPalindrome(S));
	}

}
