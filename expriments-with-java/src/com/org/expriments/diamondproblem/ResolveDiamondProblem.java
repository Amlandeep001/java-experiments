package com.org.expriments.diamondproblem;

public class ResolveDiamondProblem implements MyInterface1, MyInterface2
{
	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		// MyInterface1.super.display();
		MyInterface2.super.display();
	}

	public static void main(String[] args)
	{
		ResolveDiamondProblem rdp = new ResolveDiamondProblem();
		rdp.display();
	}
}
