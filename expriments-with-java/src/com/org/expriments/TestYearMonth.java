package com.org.expriments;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.YearMonth;
import java.util.Random;

public class TestYearMonth
{
	public static void main(String args[])
	{
		YearMonth ym = null;
		System.out.println(ym);

		String abc = "1400 s� Jean Baptiste Point du Sable Lake Shore Drive";
		System.out.println(abc.length());

		Random random = new Random();
		System.out.println(Math.round(random.nextFloat() * Math.pow(10, 13)));

		String amount = "10.44444";
		BigDecimal bigDecimal = new BigDecimal(amount);

		// System.out.println(bigDecimal.setScale(2));
		System.out.println(bigDecimal.setScale(2, RoundingMode.CEILING));

		String s = "REN�E";

		System.out.println(s.replace("�", ""));
	}
}
