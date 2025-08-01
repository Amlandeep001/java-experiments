package com.org.expriments.sealed;

// Sealed classes example in Java
// The classes that will extend the sealed class must be declared sealed, non-sealed or final.
// If there is interface marked as sealed, then the interface that will extend the interface must be declared sealed or non-sealed as interface can't be final..

sealed class Human permits Manish, Vartika, Anjali
{
	public void printName()
	{
		System.out.println("Default");
	}
}

non-sealed class Manish extends Human
{
	@Override
	public void printName()
	{
		System.out.println("Manish Sharma");
	}
}

sealed class Vartika extends Human permits Rohit
{
	@Override
	public void printName()
	{
		System.out.println("Vartika Dadheech");
	}
}

final class Anjali extends Human
{
	@Override
	public void printName()
	{
		System.out.println("Anjali Sharma");
	}
}

final class Rohit extends Vartika
{
	@Override
	public void printName()
	{
		System.out.println("Rohit Sharma");
	}
}

sealed interface SealedInterface permits DemoInterface
{
	default void voidShow()
	{
		System.out.println("Default Method Executed");
	}
}

non-sealed interface DemoInterface extends SealedInterface
{
	@Override
	default void voidShow()
	{
		System.out.println("DemoInterface Default Method Executed");
	}

	static void staticShow()
	{
		System.out.println("Static Method Executed");
	}
}

public class SealedMain
{
	public static void main(String[] args)
	{
		Human h1 = new Anjali();
		Human h2 = new Vartika();
		Human h3 = new Manish();
		Human h4 = new Rohit();

		SealedInterface demo = new DemoInterface()
		{
			// This is an anonymous class implementing the DemoInterface
		};

		h1.printName();
		h2.printName();
		h3.printName();
		h4.printName();
		demo.voidShow();
	}
}
