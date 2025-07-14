package com.org.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis
{
	public boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(Character c : s.toCharArray())
		{
			if(c == '(')
			{
				stack.push(')');
			}
			else if(c == '{')
			{
				stack.push('}');
			}
			else if(c == '[')
			{
				stack.push(']');
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
		String s = "({[]})";
		ValidParenthesis vp = new ValidParenthesis();
		System.out.println("Is the string \"" + s + "\" valid? " + vp.isValid(s));
	}
}
