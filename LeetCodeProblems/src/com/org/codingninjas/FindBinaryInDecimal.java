package com.org.codingninjas;

//https://www.naukri.com/code360/problems/finding-binary-in-decimal_975489?interviewProblemRedirection=true&search=Binary&attempt_status=COMPLETED&count=25&page=1&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class FindBinaryInDecimal
{
	public static long countOfNumbers(long n)
	{
		// Write your code here.

		/*List<Long> longList = new ArrayList<>();
		long count = 0L;
		
		for(long i = 1; i <= n; i++)
		{
			longList.add(i);
		}
		
		if(longList.size() > 0)
		{
			return longList.stream()
					.map(e -> Long.toString(e))
					.filter(a -> a.chars().allMatch(c -> c == '0' || c == '1'))
					.count();
		}
		
		if(longList.size() > 0)
		{
			for(Long e : longList)
			{
				String ele = Long.toString(e);
				if(ele.matches("[01]+"))
				{
					count++;
				}
			}
		}
		
		return count;*/

		/*long count = 0;
		for(long i = 1; i <= n; i++)
		{
			if(Long.toString(i).matches("[01]+"))
			{
				count++;
			}
		}
		return count;*/

		long count = 0;
		for(long i = 1; i <= n; i++)
		{
			if(containsOnly01(i))
			{
				count++;
			}
		}
		return count;
	}

	public static boolean containsOnly01(long num)
	{
		// Check each digit of the number
		while (num > 0)
		{
			long digit = num % 10;
			if(digit != 0 && digit != 1)
			{
				return false;
			}
			num /= 10;
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(countOfNumbers(10L));
	}
}
