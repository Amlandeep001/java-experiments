package com.org.expriments.immutable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunImmutable
{
	public static void main(String[] args) throws ParseException
	{
		String dateInString = "08-03-2024";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(dateInString);

		ImmutableClass ic = new ImmutableClass(1, "Amlan", date);
		ic.getDob().setYear(2045);

		System.out.println(ic.getDob());
	}
}
