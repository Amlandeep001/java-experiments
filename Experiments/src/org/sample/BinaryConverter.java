package org.sample;

public class BinaryConverter
{
	public static String binaryPuzzle(int n)
	{
		// Write your code here

		if(n == 0)
		{
			return "0";
		}

		StringBuilder sb = new StringBuilder();

		while (n > 0)
		{
			int remainder = n % 2;
			sb.insert(0, remainder);
			n /= 2;
		}

		return sb.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(BinaryConverter.binaryPuzzle(10));
	}

}
