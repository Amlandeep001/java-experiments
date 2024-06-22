package com.org.java;

import java.util.Scanner;

/**
 * 
 * @author Amlan
 * input = thisIsAVariable, output = this_is_a_variable
 */

public class CharacterSequence
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String charSeq = input.next();
		System.out.println("charSeq: " + charSeq);

		changeCharSequence(charSeq);

		input.close();
	}

	private static void changeCharSequence(String input1)
	{
		char ch[] = input1.toCharArray();
		String res = "";

		if(!input1.contains("_"))
		{
			for(int i = 0; i < ch.length; i++)
			{
				if(Character.isUpperCase(ch[i]))
				{
					res += "_";
					res += ch[i];
				}
				else
				{
					res += ch[i];
				}
			}
			System.out.println("C++ output: " + res.toLowerCase());
		}
		else
		{
			for(int j = 0; j < ch.length; j++)
			{
				if(ch[j] == '_')
				{
					j++;
					res += Character.toUpperCase(ch[j]);
				}
				else
				{
					res += ch[j];
				}
			}
			System.out.println("Java output: " + res);
		}
	}
}
