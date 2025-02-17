package com.org.leetcode;

/**
 * @author Amlan
 * Link: https://leetcode.com/problems/valid-palindrome/submissions
 */
public class ValidPalindrome
{
	public boolean isPalindrome(String s)
	{
		/*List<String> list = Arrays.asList(s.split(""));
		
		String ts = list.stream()
		        .map(e -> e.toLowerCase())
		        .filter(a -> a.chars().allMatch(Character::isLetterOrDigit))
		        .collect(Collectors.joining());
		
		StringBuilder sb = new StringBuilder(ts).reverse();
		
		return sb.toString().equals(ts);*/

		String test = s.toLowerCase();
		test = test.replaceAll("[^a-zA-Z0-9]", "");

		StringBuilder sb = new StringBuilder(test).reverse();

		return sb.toString().equals(test);
	}

}
