package com.org.preparation;

import java.util.HashSet;
import java.util.Set;

public class IsogramValidation
{
	public static void main(String[] args)
	{
		System.out.println(isIsogram("codedecode"));
	}

	private static boolean isIsogram(String string)
	{
		boolean isogram = true;
		char[] ch = string.toCharArray();
		Set<Character> chset = new HashSet<>();

		for(Character c : ch)
		{
			if(chset.contains(c))
			{
				isogram = false;
			}
			else
			{
				chset.add(c);
			}
		}

		return isogram;
	}
}
