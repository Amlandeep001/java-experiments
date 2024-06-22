package com.org.expriments.overriding;

//Driver class
class Main
{
	public static void main(String[] args)
	{
		Parent obj1 = new Parent();
		obj1.m2();

		Parent obj2 = new Child();
		obj2.m2();

		Parent.m3();
	}
}