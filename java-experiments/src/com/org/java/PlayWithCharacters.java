package com.org.java;

public class PlayWithCharacters
{
	public static void main(String[] args)
	{
		String str = "a2b3c4";
		String resultantString = "";

		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				resultantString += str.charAt(i);
			}
			else
			{
				int x = Character.getNumericValue(str.charAt(i));
				for(int j = 1; j < x; j++)
				{
					resultantString += str.charAt(i - 1);
				}
			}
		}
		System.out.println(resultantString);
	}

}
