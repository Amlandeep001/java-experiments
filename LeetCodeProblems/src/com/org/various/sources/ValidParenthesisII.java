package com.org.various.sources;

import java.util.Stack;

public class ValidParenthesisII
{
	public static boolean isValid(String str)
	{
		Stack<Character> stack = new Stack<>();

		for(Character c : str.toCharArray())
		{
			/*if(c == '(')
			{
				stack.push(c);
			}
			else if(c == ')')
			{
				if(stack.isEmpty() || stack.pop() != '(')
				{
					return false;
				}
			}
			else
			{
				return false; // any other invalid character
			}*/
			if(c == '(')
			{
				stack.push(')');
			}
			else if(stack.isEmpty() || stack.pop() != c)
			{
				return false;
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		String s = "())(()";
		System.out.println("Is the string \"" + s + "\" valid? " + isValid(s));
	}
}
