package com.org.codingninjas;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.naukri.com/code360/problems/compress-the-string_526?leftPanelTabValue=PROBLEM&count=25&search=&sort_entity=order&sort_order=ASC&customSource=studio_nav&page=1

public class CompressTheString
{
	public static String getCompressedString(String str)
	{
		// Write your code here.

		StringBuilder sb = new StringBuilder();

		Map<String, Long> map = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for(Map.Entry<String, Long> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				sb.append(entry.getKey());
			}
			else
			{
				sb.append(entry.getKey() + entry.getValue());
			}
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String str = "phqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxf";
		System.out.println(getCompressedString(str));
	}

}
