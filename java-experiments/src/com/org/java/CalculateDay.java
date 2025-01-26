package com.org.java;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class CalculateDay
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.of(2015, 10, 15);

		Calendar cal = Calendar.getInstance();
		// cal.set(date);
		System.out.println(cal.getDisplayName(0, 0, Locale.ENGLISH));

		/*String A = "hello";
		
		System.out.println(A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0))));
		*/
	}
}
