package com.org.java;

public class TestStrings
{
	public static void main(String[] args)
	{
		// String s = "thisIsAVariable";
		String s = "this_is_a_variable";

		String res = "";
		String res2 = "";

		if(!s.contains("_"))
		{
			for(int i = 0; i < s.length(); i++)
			{
				if(Character.isUpperCase(s.charAt(i)))
				{
					res += "_";
					res += s.charAt(i);
				}
				else
				{
					res += s.charAt(i);
				}
			}
		}
		else
		{
			for(int j = 0; j < s.length(); j++)
			{
				if(s.charAt(j) == '_')
				{
					j++;
					res2 += Character.toUpperCase(s.charAt(j));
				}
				else
				{
					res2 += s.charAt(j);
				}
			}
		}

		System.out.println(res.toLowerCase());
		System.out.println(res2);
	}
}
