package com.org.preparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap
{
	// https://www.hackerrank.com/challenges/phone-book/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

	public static void main(String[] argh)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> dictionary = new HashMap<>();
		for(int i = 0; i < n; i++)
		{
			String name = in.nextLine();
			int phone = in.nextInt();
			dictionary.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext())
		{
			String s = in.nextLine();
			if(dictionary.containsKey(s))
			{
				System.out.println(s + "=" + dictionary.get(s));
			}
			else
			{
				System.out.println("Not found");
			}
		}
		in.close();
	}
}

/*Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

Sample Output

uncle sam=99912222
Not found
harry=12299933*/
