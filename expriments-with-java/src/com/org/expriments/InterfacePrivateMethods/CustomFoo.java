package com.org.expriments.InterfacePrivateMethods;

public class CustomFoo implements Foo
{
	public static void main(String... args)
	{
		Foo customFoo = new CustomFoo();
		customFoo.bar();
		Foo.buzz();
	}
}
