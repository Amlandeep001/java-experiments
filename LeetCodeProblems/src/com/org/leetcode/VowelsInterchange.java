package com.org.leetcode;

import java.util.Arrays;
import java.util.List;

public class VowelsInterchange
{
	public String reverseVowels(String s)
	{
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		char[] ch = s.toCharArray();

		int i = 0, j = s.length() - 1;

		while (i < j)
		{
			if(!vowels.contains(ch[i]))
			{
				i++;
				continue;
			}
			if(!vowels.contains(ch[j]))
			{
				j--;
				continue;
			}
			char tmp = ch[i];
			ch[i] = ch[j];
			ch[j] = tmp;

			i++;
			j--;
		}

		return new String(ch);
	}

	public static void main(String[] args)
	{
		String s = "leetcode";

		VowelsInterchange vi = new VowelsInterchange();
		System.out.println(vi.reverseVowels(s));
	}
}
