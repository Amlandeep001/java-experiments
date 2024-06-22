package com.org.expriments.factory;

public class FactoryPatternMain
{
	public static void main(String[] args)
	{
		ProfessionFactory professionFactory = new ProfessionFactory();

		Profession doc = professionFactory.getProfession("Doctor");
		doc.print();
	}
}
