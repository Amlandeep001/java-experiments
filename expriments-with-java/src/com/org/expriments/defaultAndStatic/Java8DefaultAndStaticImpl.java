package com.org.expriments.defaultAndStatic;

public class Java8DefaultAndStaticImpl implements Java8DefaultAndStatic
{
	@Override
	public void square(int a)
	{
		System.out.println(a * a);
	}

	public static void main(String args[])
	{
		Java8DefaultAndStaticImpl d = new Java8DefaultAndStaticImpl();
		d.square(4);

		// default method executed
		d.voidShow();

		// Static method executed
		Java8DefaultAndStatic.staticShow();
	}
}
