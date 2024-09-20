package com.org.geeksforgeeks;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1?page=1&category=Strings&sortBy=submissions

public class ParenthesisChecker
{
	static boolean ispar(String x)
	{
		// add your code here

		Stack<Character> stack = new Stack<>();

		for(Character ch : x.toCharArray())
		{
			if(ch == '(')
			{
				stack.push(')');
			}
			else if(ch == '{')
			{
				stack.push('}');
			}
			else if(ch == '[')
			{
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() != ch)
			{
				return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		String s = "{([])}";
		System.out.println(ispar(s));
	}
}
