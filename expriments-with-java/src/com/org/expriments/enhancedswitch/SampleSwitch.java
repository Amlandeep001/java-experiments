package com.org.expriments.enhancedswitch;

public class SampleSwitch
{
	public static void main(String[] args)
	{
		String day = "MONDAY";

		switch(day)
		{
			case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("It's a weekday");

			case "SATURDAY", "SUNDAY" -> System.out.println("It's a weekend");

			default -> throw new IllegalArgumentException("Invalid day");
		}
	}

}
